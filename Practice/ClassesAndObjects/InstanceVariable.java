class Demo{
    int x = 10;
    int y = 20;
    int z = 10;

    void fun(){
        System.out.println("In Fun Method");
        System.out.println(x);
        System.out.println(y);
        
    }

    public static void main(String[] args){

        Demo obj =  new Demo();

        System.out.println(obj.x);
        System.out.println(obj.y);

        obj.fun();

        System.out.println(System.identityHashCode(obj.x));
        System.out.println(System.identityHashCode(obj.y));
        System.out.println(System.identityHashCode(obj.z));

    }
}