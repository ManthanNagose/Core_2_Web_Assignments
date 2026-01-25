class DemoChild extends Demo{
    DemoChild (){
        System.out.println("In Child Constructor.");
        System.out.println(x);
    }
}

class Client{
    public static void main(String[] args){
        DemoChild obj = new DemoChild();   
    }
}
