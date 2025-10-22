class Answer_8 {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 4;
        int result;

        if(num1 > 0 && num2 > 0){
            result = num1 * num2;
            System.out.println("Product of two number is : " + result);
            int rem = result % 2;

            switch (rem) {
                case 1 : System.out.println("Product calcluated is Odd number.");
                        break;
                case 0 : System.out.println("Product calculated is Even number.");
                        break;
                default : System.out.println("Wrong input");
            }

        } else {
            System.out.println("Sorry Negative numbers are not allowed.");
        }

    }
}