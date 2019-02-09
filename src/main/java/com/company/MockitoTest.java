//package com.company;
//
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnit;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.junit.MockitoRule;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static junit.framework.TestCase.assertTrue;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;
//
//@RunWith(MockitoJUnitRunner.class)
//public class MockitoTest {
//
//    @
//    private Test1 test1;
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }
//
////    @Test
////    public void whenNotUseMockAnnotation_thenCorrect() {
////        List mockList = Mockito.mock(ArrayList.class);
////
////        mockList.add("one");
////        mockList.add("two");
////        Mockito.verify(mockList).add("one");
////        Mockito.verify(mockList).add("two");
////        System.out.println(mockList.size());
////        assertEquals(0, mockList.size());
//
////        Mockito.when(mockList.size()).thenReturn(100);
////        assertEquals(100, mockList.size());
//
//        @Mock
//        List<String> mockedList;
//
//        @Test
//        public void whenUseMockAnnotation_thenMockIsInjected() {
////            mockedList.add("one");
////            mockedList.add("two");
////            mockedList.add("three");
////            System.out.println(mockedList.size());
////            Mockito.verify(mockedList).add("one");
////            Mockito.verify(mockedList).add("two");
////
////            assertEquals(1, mockedList.size());
//
//            Mockito.when(mockedList.size()).thenReturn(100);
//            assertEquals(100, mockedList.size());
//            Mockito.when(mockedList.size()).thenReturn(10);
//            assertEquals(10, mockedList.size());
//
//        }
//    }
//
////}