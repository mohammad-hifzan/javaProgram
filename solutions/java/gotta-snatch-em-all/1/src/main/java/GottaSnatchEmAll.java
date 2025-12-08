import java.util.List;
import java.util.Set;
import java.util.HashSet;
class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> setCards = new HashSet<>(cards);
        return setCards;
        // throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.newCollection() method");
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
        // throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.addCard() method");
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        // throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.canTrade() method");
        if (myCollection.size() == 0 || theirCollection.size() == 0) {
            return false;
        }
        boolean flag1 = theirCollection.containsAll(myCollection);
        boolean flag2 = myCollection.containsAll(theirCollection);
        
        return !flag1 && !flag2;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> elem : collections) {
            common.retainAll(elem);
        }
        return common;
        // throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.commonCards() method");
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < collections.size(); i++) {
            for (String elem : collections.get(i)) {
                unique.add(elem);
            }
        }


        return unique;
        // throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.allCards() method");
    }
}
