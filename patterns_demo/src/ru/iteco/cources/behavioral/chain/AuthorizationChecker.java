package ru.iteco.cources.behavioral.chain;

import java.util.HashMap;
import java.util.Map;

public class AuthorizationChecker extends Checker {
    private Map<String, String> authoritiesMap = new HashMap<>();

    public AuthorizationChecker(Checker next) {
        super(next);

        authoritiesMap.put("USER1", "USER");
        authoritiesMap.put("USER2", "ADMIN");
    }

    @Override
    public boolean check(Object data) {
        System.out.println("Authorization check");
        String role = authoritiesMap.get(data.toString());

        if(!role.equals("ADMIN")) {
            return false;
        }

        return checkNext(data);
    }
}
