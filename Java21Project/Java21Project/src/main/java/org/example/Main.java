package org.example;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a=49;
        //String Templates containing embedded expression (evaluated at runtime)
        //Now String can contains variables,methods or fields commutated at runtime

        System.out.println(STR."value of a is \{a}");

        String title="Contact page";
        String heading="Welcome to Programming World";
        String body="Hello, Please do Subscribe youtube channel";

        String html=STR. """

                           <html>
                           <head>
                                   <title>
                                   \{title}
                                   </title>
                           </head>
                           <body>
                               <heading>
                               \{heading}
                               </heading>
                               <p>\{body}</p>
                           </body>
                           """;
        System.out.println(html);

        try{
            double d=5/0;
            System.out.println(d);
        }
        catch(Exception _)
        {
            System.out.println("Error");
        }
                

    }
}