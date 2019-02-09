package com.company;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibo(n));
    }

    public static int Factorial(int n){
        if(n==0) return 1;
        else{
            return n*Factorial(n-1);
        }    }


    public static int Fibo(int t){
            if(t == 1 || t==0){
                return t;
            }
//            else if(t==0) return 0;
            else{return Fibo(t-1) + Fibo(t-2);}
        }

//    static class TestClass {
//
//        public String getThing() {
//            return "Thing";
//        }
//
//        public String getOtherThing() {
//            return getThing();
//        }
//        @Test
//        public String getStringTest(){
//            String res = " ";
//            final TestClass testClass = Mockito.spy(new TestClass());
//            Mockito.when(testClass.getThing()).thenReturn("Some Other thing");
//            res = testClass.getOtherThing();
//            return res;
//        }
//    }




}
