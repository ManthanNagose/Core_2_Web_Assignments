//to print first N whole numbers , N= form user 

import java.io.*;

class Ans_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a value of N: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Whole Number upto value N is : ");

        for(int i=0; i <= num; i++){

            System.out.print(i + " ");
        }
    }
}