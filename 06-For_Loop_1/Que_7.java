//to print table of N

import java.util.*;

class Ans_7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("The table of N is : ");
        
        for(int i=n; i<= n*10; i=i+n){
            System.out.print(i + " ");
        }
    }
}