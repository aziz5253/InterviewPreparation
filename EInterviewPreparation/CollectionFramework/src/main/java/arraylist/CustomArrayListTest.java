package src.main.java.arraylist;

public class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList<Integer> list=new CustomArrayList<>(10);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);


        System.out.println(list);


    }
}
