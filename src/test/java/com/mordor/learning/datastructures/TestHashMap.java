package com.mordor.learning.datastructures;

import com.mordor.learning.datastructures.impl.IHashMap;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestHashMap {

    @Test
    public void testHashMap(){
        IHashMap<Integer,Integer> testMap=new IHashMap<>();
        assertNotNull(testMap);
        assertEquals(testMap.get(3),null);
        assertEquals((int)testMap.put(4,6),6);
        assertEquals((int)testMap.get(4),6);
        assertEquals(testMap.remove(5),false);
        assertEquals(testMap.remove(4),true);
        assertEquals(testMap.get(4),null);
       // assertEquals((int)testMap.get(6),6);
    }
}
