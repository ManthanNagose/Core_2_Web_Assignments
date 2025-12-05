class StaticBlockDemo {

    static {
        System.out.println("Ststic Block 1");
    }

    static {
        System.out.println("Ststic Block 2");
    }

    public static void main(String [] args){

        System.out.println("Inside main method");
        
    }

    static {
        System.out.println("Ststic Block 3");
    }
}
