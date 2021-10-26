package ru.iteco.cources.queue;

import ru.iteco.cources.queue.search.Search;
import ru.iteco.cources.queue.search.SearchUser;
import ru.iteco.cources.queue.spot.Spot;
import ru.iteco.cources.queue.spot.SpotUser;

public class Demo {
    public static void main(String[] args) {
        SpotSearchQueue queue = new SpotSearchQueue();
        Spot spot = new Spot(queue);

        Search search1 = new Search(queue, "1");
        Search search2 = new Search(queue, "2");

        SpotUser artem = new SpotUser(1l, "Artem", true, (short) 31);
        spot.addUser(artem);

        SearchUser artemSearch = new SearchUser(1l, (short) 31, true);
        search1.searchUsersList.add(artemSearch);
        search2.searchUsersList.add(artemSearch);

        spot.updateUser(new SpotUser(1l, "Artem", true, (short) 32));
    }
}
