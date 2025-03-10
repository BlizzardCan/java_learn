// Polymorphic
public class Hello {
    public static void main(String[] args) {

    }
}


interface Person {
    void run();
    String getName();
}

class Student implements Person {
    private String name;
    @Override
    public void run (){
        System.out.println(name);
    }
    @Override
    public String getName(){
        return name;
    }

}