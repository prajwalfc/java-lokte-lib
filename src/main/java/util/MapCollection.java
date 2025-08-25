package util;

import java.util.HashMap;

import java.util.*;
import java.util.function.Supplier;

public class MapCollection<K, C extends Collection<V>, V> extends HashMap<K, C> {

    private final Supplier<C> collectionSupplier;

    public MapCollection(Supplier<C> collectionSupplier) {
        this.collectionSupplier = collectionSupplier;
    }

    public void addToCollection(K key, V value) {
        this.computeIfAbsent(key, k -> collectionSupplier.get()).add(value);
    }

    public void addAllToCollection(K key, Collection<V> value) {
        this.computeIfAbsent(key, k -> collectionSupplier.get()).addAll(value);
    }
}

