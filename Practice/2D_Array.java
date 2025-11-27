import java.util.*;

class Multi_Dimension_Array{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of 2D_Array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols]; 

        System.out.println("Enter Array Data: ");

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                arr[i][j] = sc.nextInt();

            }
        }


        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(" " + arr[i][j]);
                sum += arr[i][j];
            }
            System.out.println(" ");
        }

        System.out.println("Sum is : " + sum);



    }
}
