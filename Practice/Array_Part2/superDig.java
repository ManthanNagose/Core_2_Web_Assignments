import java.util.*;
class Super_Digit {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        String alice_num  = sc.next();
        int k = sc.nextInt();
        String bob_num = "";

        for(int i=0; i<k; i++){
            bob_num += alice_num;
        }
        System.out.println(bob_num);

        int sum = 0;
        for(int i=0; i<bob_num.length(); i++){
            int digit = bob_num.charAt(i) - '0';
            //System.out.println(digit);

            sum += digit;
        }
        //System.out.println(sum);

        int ans = 0;
        while(sum > 9){

            int add = 0;

            while ( sum > 0){
                add += sum % 10;
                sum = sum / 10;
            }

            sum = add;
        }
        System.out.println("Super digit is : " + sum);
    }
    
}
