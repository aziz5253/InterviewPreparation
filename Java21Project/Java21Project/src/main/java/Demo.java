import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;

record Person(String name, int age) {}

 void main(String args[]){
        System.out.println("This main is without class");

        Person obj=new Person("Aziz",21);
        Object str="name";
        switch (str) {
            case Person(_, int age) when age > 18 -> System.out.println("Adult");
            case String _ -> System.out.println("stringDetails");
            default -> System.out.println("edfaukt");
        }

        if(obj instanceof  Person(_,int age))
     {
         System.out.println("It is String");
     }
        if(str instanceof String _){
            System.out.println("It is String11");
     }
    //Sequence Colleection

     List<String> list=new ArrayList<>();
        list.addFirst("First Element");
        list.addLast("last Eleemnt");
     System.out.println(list);
     System.out.println(list.getFirst());
     System.out.println(list.getLast());
     System.out.println(list.reversed().add("Third Element"));
     System.out.println(list.reversed());


     SequencedMap<Integer, String> cache = new LinkedHashMap<>();

     cache.putLast(1, "A");
     cache.putLast(2, "B");

     cache.pollFirstEntry(); // remove oldest

     System.out.println(cache);



 }


