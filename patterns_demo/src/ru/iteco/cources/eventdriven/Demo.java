package ru.iteco.cources.eventdriven;

public class Demo {
    public static void main(String[] args) {
        KafkaImitator kafkaImitator = new KafkaImitator();
        Spot spot = new Spot(kafkaImitator);
        Search search = new Search(kafkaImitator);

        SpotUser artem = new SpotUser(1, "Artem", (short) 31, true);
        SearchUser artemS = new SearchUser(1, (short) 31, true);

        search.getSearchUserSet().add(artemS);

        artem.setAge((short) 32);
        spot.add(artem);
    }
}
