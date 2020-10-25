package com.mordor.learning.datastructures.impl;

import com.mordor.learning.datastructures.IMap;

import java.util.ArrayList;
import java.util.List;

public class IHashMap<K,V> implements IMap<K,V> {

    private ArrayList<ArrayList<KVPair>> kvList;

    public  IHashMap(){
        kvList=new ArrayList<ArrayList<KVPair>>();
        for(int i=0;i<10;i++){
            ArrayList<KVPair> list=new ArrayList<>();
            kvList.add(list);
        }
    }

    @Override
    public V get(K key) {
        int hashcode=hashCode(key);
        List<KVPair> bucketedList=kvList.get(hashcode);
        for(KVPair<K,V> kvPair:bucketedList){
            if (kvPair.k.equals(key)){
                return kvPair.v;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
            int hashcode=hashCode(key);
            List<KVPair> bucketedList=kvList.get(hashcode);

            for(KVPair<K,V> kvPair:bucketedList){
                if (kvPair.k.equals(key)){
                    kvPair.v=value;
                    return kvPair.v;
                }
            }
            KVPair<K,V> kvPair=new KVPair<K,V>();
        kvPair.k=key;kvPair.v=value;
            bucketedList.add(kvPair);
        return kvPair.v;
    }

    @Override
    public boolean remove(K key) {
        int hashcode=hashCode(key);
        ArrayList<KVPair> kvPairArr=kvList.get(hashcode);
        int index=-1;

        for(int i=0;i<kvPairArr.size();i++){
            if(kvPairArr.get(i).k.equals(key)){
                index=i;
                break;
            }
        }

        if(index!=-1){
            kvPairArr.remove(index);
            return true;
        }
        return false;
    }

    class KVPair<K,V>{
        K k;
        V v;
    }

    private int hashCode(K k){
        if(k instanceof Integer){
            return (Integer)k%10;
        }
        return 0;
    }

}
