//to print even number upto N 

import java.io.*;

class Ans_4 { 
    public static void main(String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter value of N: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Even numbers upto N are : ");

        for(int i=0; i<=num; i++) {
            if(i % 2 == 0){
                System.out.print( i + " ");
            }
        }

        
    }
}