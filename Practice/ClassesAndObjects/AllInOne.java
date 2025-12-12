class AllDemo {

    int x = 10;
    static int y = 20;

    AllDemo() {
        System.out.println("Inside Constructor");
    }

    {
        System.out.println("In Instance Block 1");
    }

    static {
        System.out.println("In Static Block 1");
    }

    void fun() {
        System.out.println("In Instance method Fun");
    }

    
    static void run() { 
        System.out.println("In Static Method Run");
    }

    public static void main( String args []) {
        AllDemo obj = new AllDemo();
        obj.fun();
        System.out.println(obj.x);
        System.out.println(y);
        run();
    }

    {
        System.out.println("In Instanteous Block 2");
    }

    static {
        System.out.println("In Static Block 2");
    }
    
}
