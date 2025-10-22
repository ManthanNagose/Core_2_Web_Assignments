//to print count of odd number from 1 to N

import java.util.*;

class Ans_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();

        System.out.println("Total of N natural numbers are : ");

        int count=0;
        for(int i=1; i<=N; i++){
            if(i % 2 != 0){
                count++;
            }
        }
            System.out.println(count);
    }
}