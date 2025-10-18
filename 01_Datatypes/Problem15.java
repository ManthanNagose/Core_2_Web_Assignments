class Prb15Ans {
    public static void main(String[] args) {
        //Que 1
        long num = 123456789101123L;
        System.out.println(num);

        //Que 2
        long num1;
        int num2 = 2000005;
        num1 = num2;
        System.out.println(num1); // 2000005

        //Que 3
        long n = 2000005L;
        int n2 = n;
        System.out.println(n2); // incompatible types: possible lossy conversion from long to int


    }
}