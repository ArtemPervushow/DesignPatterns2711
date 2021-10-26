package ru.iteco.cources.eventsourcing;

import java.time.Instant;
import java.util.*;

public class AccountService {
    private TreeSet<AccountEvent> eventSet = new TreeSet<>();
    private Random random = new Random();
    private Map<Integer, Integer> eventAccountCountMap = new HashMap<>();
    private Map<Integer, Account> accountSnapshotMap = new HashMap<>();

    public void createAccount(int id, String owner) {
        AccountEvent event = new AccountEvent(AccountEventType.CREATE,
                                                id,
                                                new CreateData(id, owner));

        eventSet.add(event);
    }

    public void addMoney(int id, float money) {
        AccountEvent event = new AccountEvent(AccountEventType.DEPOSIT,
                                             id,
                                             new DepositData(money));

        eventSet.add(event);
    }

    public void widthdrawMoney(int id, float money) {
        AccountEvent event = new AccountEvent(AccountEventType.WIDTHDRAW,
                                             id,
                                             new WidthdrawData(money));

        eventSet.add(event);
    }

    public void closeAccount(int id) {
        AccountEvent event = new AccountEvent(AccountEventType.CLOSE,
                                              id,
                                                new CloseData("I want"));

        eventSet.add(event);
    }

    public void changeOwner(int id, String newOwner) {
        AccountEvent event = new AccountEvent(AccountEventType.CHANGE_OWNER,
                                              id,
                                                new ChangeOwnerData(newOwner));

        eventSet.add(event);
    }

    public Account getAccount(int id) {
        Account account = null;

        for (AccountEvent event:
             eventSet) {
            if(event.getEntityId() == id) {
                if(accountSnapshotMap.containsKey(id)){
                    Account snapshot = accountSnapshotMap.get(id);
                    if(snapshot.getLastUpdateDate().after(event.getEventDate())){
                        account = snapshot;
                        continue;
                    }
                }

                switch (event.getType()) {
                    case CREATE:
                        CreateData createData = (CreateData) event.getEventData();

                        account = new Account(createData.getAccountId(),
                                                createData.getOwner(),
                                                event.getEventDate());
                        break;
                    case DEPOSIT:
                        DepositData depositData = (DepositData) event.getEventData();

                        account.setBalance(account.getBalance() +
                                            depositData.getAppendBalance());
                        break;
                    case WIDTHDRAW:
                        WidthdrawData widthdrawData = (WidthdrawData) event.getEventData();

                        account.
                                setBalance(account.getBalance() -
                                            widthdrawData.getWidthdrawBalance());
                        break;
                    case CHANGE_OWNER:
                        ChangeOwnerData changeOwnerData = (ChangeOwnerData) event.getEventData();

                        account.setOwner(changeOwnerData.getNewOwner());
                        break;
                    case CLOSE:
                        CloseData closeData = (CloseData) event.getEventData();

                        account.setActive(false);
                        break;
                }
            }
        }

        updateAccountEventCount(id);
        if(eventAccountCountMap.get(id) > 5) {
            account.setLastUpdateDate(Date.from(Instant.now()));

            accountSnapshotMap.put(id, account);

            eventAccountCountMap.put(id, 0);
        }

        return account;
    }

    private void updateAccountEventCount(int id) {
        if(eventAccountCountMap.containsKey(id)) {
            int countOfEvents = eventAccountCountMap.get(id);
            countOfEvents++;
            eventAccountCountMap.put(id, countOfEvents);
        } else {
            eventAccountCountMap.put(id, 1);
        }
    }


    public float getDepositOperationsSumCommand(int id) {
        float sum = 0;
        for (AccountEvent event:
             eventSet) {
            if(event.getEntityId() == id) {
                if (event.getType().equals(AccountEventType.DEPOSIT)) {
                    DepositData depositData = (DepositData) event.getEventData();
                    sum += depositData.getAppendBalance();
                }
            }
        }

        return sum;
    }
}
