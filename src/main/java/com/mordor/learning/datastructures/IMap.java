package com.mordor.learning.datastructures;

public interface IMap<K,V> {

    public V get(K k);

    public V put(K key, V value);

    public boolean remove(K key);
}
