//package com.company;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Spy;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class SpyTest1 {
//
//    @Spy
//    private Map<Integer, String> map = new HashMap<>();
//
//    @Test
//    public void testSpyMapPutDefaultBehavior() {
//        //when
//        map.put(1, "test");
//
//        //then
//        assertThat(map.get(1), is("test"));
//    }
//
//    @Test
//    public void testSpyMapKeySetDefaultBehavior() {
//        //when
//        map.put(1, "test1");
//        map.put(2, "test2");
//
//        //then
//        assertThat(map.keySet(), containsInAnyOrder(1, 2));
//    }
//
//    @Test
//    public void testSpyMapValuesWithDefinedBehavior() {
//        Collection<String> stub = Arrays.asList("test1", "test2", "test3");
//        when(map.values()).thenReturn(stub);
//
//        //when
//        map.put(1, "test");
//
//        //then
//        assertThat(map.values(), is(stub));
//    }
//
//}