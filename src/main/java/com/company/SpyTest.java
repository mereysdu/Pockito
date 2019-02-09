package com.company;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.Spy;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SpyTest {
//    @Test
//    public void whenNotUseSpyAnnotation_thenCorrect() {
//        List<String> spyList = Mockito.spy(new ArrayList<String>());
//
//        spyList.add("one");
//        spyList.add("two");
//        spyList.add("three");
//
//        Mockito.verify(spyList).add("one");
//        Mockito.verify(spyList).add("two");
//        Mockito.verify(spyList).add("three");
//
//        assertEquals(3, spyList.size());
//
//        Mockito.doReturn(100).when(spyList).size();
//        assertEquals(100, spyList.size());
//    }

    @Spy
    List<String> spiedList = new ArrayList<String>();

    @Test
    public void whenUseSpyAnnotation_thenSpyIsInjected() {
        spiedList.add("one");
        spiedList.add("two");

        Mockito.verify(spiedList).add("one");
        Mockito.verify(spiedList).add("two");

        assertEquals(2, spiedList.size());

        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

    @Test
    public void iterator_will_return_hello_world(){

        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Hello").thenReturn("World");

        String res = i.next()+" "+ i.next();

        assertEquals("Hello World",res);
    }
    @Test
    public void with_arguments(){

        LinkedList mockedList = mock(LinkedList.class);
        mockedList.add("a");
        mockedList.add("b");
        when(mockedList.get(0)).thenReturn("First");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        assertNull(mockedList.get(4555));
        assertEquals("First",mockedList.get(0));
        assertEquals(mockedList.get(1),new RuntimeException());
//        System.out.println(mockedList.get(0));
//        System.out.println(mockedList.get(1));
//        System.out.println(mockedList.get(999) + "#");


//        assertEquals(45,c.compareTo(10000));
    }





}
