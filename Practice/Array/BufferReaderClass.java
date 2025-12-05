import java.io.*;

class BR_Demo {
    public static void main ( String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter num1: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter Float num: ");
        float num2 = Float.parseFloat(br.readLine());

        System.out.println("Enter a Character : ");
        char ch = br.readLine().charAt(0);

        System.out.println("Enter a String : ");
        String str = br.readLine();

        System.out.println("Entered Integer Number is : " +  num1);
        System.out.println("Entered Float Number is : " + num2);
        System.out.println("Entered Character value is : " + ch);
        System.out.println("Entered String is : " + str);

    }
}