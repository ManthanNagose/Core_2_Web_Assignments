//to print table of N in reverse order

import java.util.*;

class Ans_8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("The table of N in reverse order is : ");
        
        for(int i=n*10; i >= n; i=i-n){
            System.out.print(i + " ");
        }
    }
}