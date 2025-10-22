//to print first N 3-digits numbers , N= form user 

import java.io.*;

class Ans_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a value of N: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("3-Digit Numbers are: ");

        for(int count = 0; count <= num; count++){

            System.out.print(100 + count + " ");
        }

        
    }
}