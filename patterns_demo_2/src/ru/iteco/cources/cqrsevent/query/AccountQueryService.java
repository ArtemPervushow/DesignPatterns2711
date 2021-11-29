package ru.iteco.cources.cqrsevent.query;

import ru.iteco.cources.cqrsevent.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AccountQueryService {
    private HashMap<Integer, Account> accounts = new HashMap();

    //NOT for user
    public void processEvent(AccountEvent event) {
        Account account = null;

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

            case CANCELL:
                CancellData cancellData = (CancellData) event.getEventData();


        }

        accounts.put(event.getEntityId(), account);
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    //NOT for user
    public void clear() {
        accounts.clear();
    }

    public List<Account> getActiveAccount() {
        return accounts
                .entrySet()
                .stream()
                .filter(acc -> acc.getValue().isActive())
                .map(acc -> acc.getValue())
                .collect(Collectors.toList());
    }
}
