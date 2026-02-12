interface Mahi{

    void fun();

    void run();

    default void gun(){
        System.out.println("In gun");
    }
}

abstract class Manthan implements Mahi{
    public void fun(){
        System.out.println("In fun method");
    }
}



abstract class Memo {
    void fun(){
        System.out.println("In method fun");
    }
}



public class Client {
    public static void main(String[] args){
        Manthan.fun();
    }
}
