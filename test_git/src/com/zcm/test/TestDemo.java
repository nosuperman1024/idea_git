package com.zcm.test;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println("hello world");
       int i=1;
       int j =2;
        int add = add(i, j);
        System.out.println(add);


    }

    public static int  add(int i,int j){
        int total ;
        total = i+j;
        return total;
    }
}
