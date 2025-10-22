//to print sum of N natural numbers

import java.util.*;

class Ans_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N : ");
        int num = sc.nextInt();

        System.out.println("Total of N natural numbers are : ");

        int sum=0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
            System.out.println(sum);
    }
}