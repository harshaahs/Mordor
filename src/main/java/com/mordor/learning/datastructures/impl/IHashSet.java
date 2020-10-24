package com.mordor.learning.datastructures.impl;

import com.mordor.learning.datastructures.ISet;

import java.util.ArrayList;

public class IHashSet<T> implements ISet<T> {

    private int count;
    private ArrayList<ArrayList<T>> set;

    public IHashSet(){

        count=0;
        set=new ArrayList<ArrayList<T>>();
        //Using 10 buckets for this sample implementation
        for(int i=0;i<10;i++){
            set.add(i,new ArrayList<T>());
        }
      //  throw new RuntimeException("Error!!");
    }

    @Override
    public boolean add(T t) {
        int hashcode=hashCode(t);
        if(!set.get(hashcode).contains(t)){
            set.get(hashcode).add(t);
            count++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(T t) {
        int hashcode=hashCode(t);
        int index=set.get(hashcode).indexOf(t);
        if(index!=-1){
            set.get(hashcode).remove(index);
            count--;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T t) {
        int hashcode=hashCode(t);
        int index=set.get(hashcode).indexOf(t);
        if(index!=-1){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private int hashCode(T t){
        if(t instanceof Integer){
            return (Integer)t%10;
        }
        return 0;
    }
}
