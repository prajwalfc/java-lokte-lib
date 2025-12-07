package util;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MapCollectionTest {

    @Test
    void addToCollectionList() {

        MapCollection<String, List<String>, String> mapCollection = new MapCollection<>(ArrayList::new);
        mapCollection.addToCollection("Nepal", "Kathmandu");
        mapCollection.addToCollection("Nepal", "Kathmandu");
        mapCollection.addToCollection("Nepal", "Pokhara");
        mapCollection.addToCollection("India", "Delhi");
        mapCollection.addToCollection("India", "Delhi");
        mapCollection.addToCollection("India", "Chennai");
        assert mapCollection.size() == 2;
        assert mapCollection.get("Nepal").size() == 3;
        assert mapCollection.get("India").size() == 3;
    }

    @Test
    void addAllToCollectionSet() {
        MapCollection<String, Set<String>, String> mapCollection = new MapCollection<>(HashSet::new);
        mapCollection.addToCollection("Nepal", "Kathmandu");
        mapCollection.addToCollection("Nepal", "Kathmandu");
        mapCollection.addToCollection("Nepal", "Pokhara");
        mapCollection.addToCollection("India", "Delhi");
        mapCollection.addToCollection("India", "Delhi");
        mapCollection.addToCollection("India", "Chennai");
        assert mapCollection.size() == 2;
        assert mapCollection.get("Nepal").size() == 2;
        assert mapCollection.get("India").size() == 2;
    }
}