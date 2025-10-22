// to print N natural number, N= input form user 

import java.io.*;

class Ans_1 {
    public static void main( String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the value of N : ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("The natural number upto N is : ");

        for(int i=1; i<= num; i++){
            System.out.print(i + " ");
        }

    }
}