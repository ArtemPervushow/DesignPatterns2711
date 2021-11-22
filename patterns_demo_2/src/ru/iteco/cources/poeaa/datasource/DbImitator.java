package ru.iteco.cources.poeaa.datasource;

import ru.iteco.cources.poeaa.datasource.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DbImitator {
    public String getEntityUsingSQL(String sql) {
        User user = new User(UUID.randomUUID(), "Artem", true, (short) 31);
        return user.toString();
    }

    public List<String> getEntityListUsingSQL(String sql) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user =new User(UUID.randomUUID(),
                            "User" + i,
                              true,
                                  (short) (i*10));
            resultList.add(user.toString());
        }

        return resultList;
    }

    public boolean updateSomeUsingSQL(String sql) {
        return true;
    }

    public boolean insertSomeUsingSQL(String sql) {
        return true;
    }
}
