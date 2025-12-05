import java.util.*;

class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Integer Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Float Number: ");
        double num2 = sc.nextFloat();

        System.out.println("Enter String : ");
        String str = sc.next();

        System.out.println("Enter char : ");
        char ch = sc.next().charAt(0);

        System.out.println("Entered Integer number is : " + num1);
        System.out.println("Entered Float Number is : " + num2);
        System.out.println("Entered String is : " + str);
        System.out.println("Entered char value is : " + ch);
    }
}