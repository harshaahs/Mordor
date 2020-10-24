package com.mordor.learning.datastructures;
import static org.junit.jupiter.api.Assertions.*;
import com.mordor.learning.datastructures.impl.IHashSet;
import org.junit.jupiter.api.Test;

public class TestHashSet {

    @Test
    public void testHashSet(){
        IHashSet<Integer> testSet=new IHashSet<Integer>();
        assertNotNull(testSet);
        assertEquals(testSet.add(12),true);
        assertEquals(testSet.contains(12),true);
        assertEquals(testSet.remove(11),false);
        assertEquals(testSet.remove(12),true);
        assertEquals(testSet.contains(12),false);
        assertEquals(testSet.add(1),true);
        assertEquals(testSet.add(11),true);
        assertEquals(testSet.contains(11),true);
        assertEquals(testSet.contains(3),false);
        assertEquals(testSet.add(11),false);
    }
}
