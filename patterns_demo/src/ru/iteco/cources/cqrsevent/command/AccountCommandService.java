package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.query.AccountQueryService;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class AccountCommandService {
    private List<AccountCommand> accountCommandList = new LinkedList<>();
    private static Random random = new Random();
    private AccountQueryService accountQueryService;

    public AccountCommandService(AccountQueryService accountQueryService) {
        this.accountQueryService = accountQueryService;
    }

    public void createAccount(int id, String owner) {
        AccountCommand command = new CreateAccountCommand(id, owner);
        accountCommandList.add(command);

        accountQueryService.processEvent(command.apply());
    }

    public void addMoney(int id, float money) {
        AccountCommand command = new AppendMoneyCommand(id, money);
        accountCommandList.add(command);

        accountQueryService.processEvent(command.apply());
    }

    public void widthdrawMoney(int id, float money) {
        AccountCommand command = new WithdrawMoneyCommand(id, money);
        accountCommandList.add(command);

        accountQueryService.processEvent(command.apply());
    }

    public void closeAccount(int id) {
        AccountCommand command = new CloseAccountCommand(id);
        accountCommandList.add(command);

        accountQueryService.processEvent(command.apply());
    }

    public void changeOwner(int id, String newOwner) {
        AccountCommand command = new ChangeOwnerCommand(id, newOwner);
        accountCommandList.add(command);

        accountQueryService.processEvent(command.apply());
    }

    public void reprocessAllAccounts() {
        accountQueryService.clear();
        for (AccountCommand command:
             accountCommandList) {
            accountQueryService.processEvent(command.apply());
        }
    }
}
