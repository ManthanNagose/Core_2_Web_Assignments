import java.util.*;
class Multi_d_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int arr[][] = new int[rows][cols];
        
        System.out.println("Enter data in array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Elements at diagonal are : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if( i == j || i + j == (rows - 1)){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    
}
