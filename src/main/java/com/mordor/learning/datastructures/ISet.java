package com.mordor.learning.datastructures;

/*
* This class encapsulates the ADT that is Set. Naming this as ISet
* to distinguish this easily from java.util.Set.
* Sets allows you to store a list of non-repeated values.
*
*
*
* */

//T refers to the generic type inference. Any object can be passed due to this.
public interface ISet<T> {

    public boolean	add(T t);
    public boolean  remove(T t);
    public boolean  contains (T t);
    public boolean  isEmpty();



}
