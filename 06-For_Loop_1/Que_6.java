//to print number in reverse order form N to 10

import java.util.*;

class Ans_6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("The numbers in reverse order is : ");
        
        for(int i=n; i>=10; i--){
            System.out.print(i + " ");
        }
    }
}