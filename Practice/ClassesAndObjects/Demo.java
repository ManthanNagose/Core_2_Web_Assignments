class Demo{

    static int x = 200; 
    int z = 200;

    static void fun(){

        System.out.println("Inside Static method");
    }

    void run(){
        System.out.println("Inside non-static Method");
        System.out.println(x);
        System.out.println(this.z);
        fun();
    }

    public static void main(String[] args){
        Demo obj = new Demo();

        System.out.println(x);
        fun();
        System.out.println(obj.z);
        obj.run();


        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(obj.z));
    }
}
