import java.util.*;

class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean flag = true;

        boolean[] br = new boolean[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 65 && ch <= 90 ){
                ch = Character.toLowerCase(ch);
            }
            br[ch - 'a'] = true;

            System.out.print(ch);

        }
        

        for(int j=0; j<br.length; j++){
            if(br[j] == false){
                flag = false;
            }
        }

        if( flag == false){
            System.out.println("String is not pangram.");
        }else{
            System.out.println("String is Panagram.");
        }

    }
}