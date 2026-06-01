package com.example.SpringProfiling.controller;

public class TestImmutable {
 
    
        public static void main(String[] args) {
            String s = new String ("Java");
            s = "Developer";
            System.out.println(s);
            String s1 = new String("5");
            System.out.println(1 + 10 + s + 1 + 10);
        }
    
 
}