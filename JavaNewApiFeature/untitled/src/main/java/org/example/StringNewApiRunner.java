package org.example;
class SampleClass{
    String str=null;
}
public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" L R ".strip().replace(" ","@"));
        System.out.println(" L R ".stripLeading().replace(" ","@"));
        System.out.println(" L R ".stripTrailing().replace(" ","@"));
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        System.out.println(
                "UPPER".transform((String s) -> s.substring(2))
        );
        System.out.println("My name is %s.My age is %d.".formatted("Ranga",25));

        String str=null;

       // System.out.println(str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "str" is null
        //	at org.example.StringNewApiRunner.main(StringNewApiRunner.java:17)

        SampleClass sample=new SampleClass();
        System.out.println(sample.str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "sample.str" is null
        //	at org.example.StringNewApiRunner.main(StringNewApiRunner.java:24)


    }
}
