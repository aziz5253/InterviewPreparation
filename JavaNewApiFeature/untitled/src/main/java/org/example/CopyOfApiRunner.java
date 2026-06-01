package org.example;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Ranga");
        names.add("Ravi");
        names.add("John");

        doNotChangeName(List.copyOf(names));
        System.out.println(names);
    }

    private static void doNotChangeName(List<String> names) {
        names.add("Should not be allowed");

    }
}
