class Addition{

    int num1;
    int num2;

    Addition(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void get_Data(){
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }


}

class Main{
    public static void main(String[] args){

        Addition obj = new Addition(10,20);
        obj.get_Data();
    }
}