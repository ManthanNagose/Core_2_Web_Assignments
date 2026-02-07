interface Demo{
    public default void fun(){
        System.out.println("In fun");
    }
    public abstract void run();
}

class DemoChild1 implements Demo{
    public void run(){
        System.out.println("In run Child1");
    }
}

class DemoChild2 implements Demo{
    public void run(){
        System.out.println("In run Child2");
    }
}

class DemoChild3 implements Demo{
    public void run(){
        System.out.println("In run Child3");
    }

    public void fun(){
        System.out.println("In fun child3");
    }
}

public class Main{
    public static void main(String[] args){
        Demo obj1 = new DemoChild1();
        Demo obj2 = new DemoChild2();
        Demo obj3 = new DemoChild3();

        obj1.fun();
        obj1.run();

        obj2.fun();
        obj2.run();

        obj3.fun();
        obj3.run();

    }
}