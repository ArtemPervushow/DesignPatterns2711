package ru.iteco.cources.poeaa.transformview;

import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String, Score> scoreMap = new HashMap<>();
    private Map<String, Credit> creditMap = new HashMap<>();

    public Model() {
        scoreMap.put("111", new Score(1000.5f, "111", "Artem"));
        scoreMap.put("222", new Score(6000.5f, "222", "Kate"));

        creditMap.put("333", new Credit(999.0f, "333","111"));
        creditMap.put("444", new Credit(333.7f, "444", "222"));
    }

    public Score getScoreByName(String score){
        return scoreMap.get(score);
    }

    public Credit getCreditByName(String credit) {
        return creditMap.get(credit);
    }
}
