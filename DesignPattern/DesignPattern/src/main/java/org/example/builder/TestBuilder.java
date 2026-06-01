package org.example.builder;

public class TestBuilder {
    public static void main(String[] args) {
        User user=new User.Builder("Aziz") .email("aziz@example.com")
                .phone("1234567890")
                .address("Mumbai")
                .build();
        System.out.println(user);


    }
}
