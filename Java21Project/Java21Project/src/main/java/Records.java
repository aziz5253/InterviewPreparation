record User(int userId,String name){

}
public class Records{
    public void Testing(Object ob){
        if(ob instanceof User(int userId,String name)){
            System.out.println("User Id===="+userId);
            System.out.println("User name===="+name);
        }
    }
    public static void switchTesting(Object obj){
        switch(obj){
            case User(int userId,String name) -> System.out.printf("o is position:%d%s%n",userId,name);
            case String s->System.out.printf("o is String :%s%n",s);
            default->System.out.printf("o is something else %s%n",obj);
        }
    }
    public static void main(String args[]){
        new Records().Testing(new User(1235,"Aziz"));
        Records.switchTesting(new User(1235,"Aziz"));
    }
}

