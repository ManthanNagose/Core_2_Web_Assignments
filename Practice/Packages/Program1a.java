import accessDefault.*;
class DemoChild extends Demo{

    DemoChild(){
        System.out.println("DemoChild Constructor");
        System.out.println(x);
    }
}

class Main{
    public static void main(String[] args){
        DemoChild obj = new DemoChild();

    }
}