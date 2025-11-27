import java.io.*;

class ArrayInput {
    public static void main (String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Array Size: ");
        int arrSize = Integer.parseInt(br.readLine());
        
        int arr[] = new int[arrSize];

        System.out.println("Enter the Elements in array: ");
        
        for(int i=0; i < arrSize; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The data in Array is : ");

        for(int i=0; i < arrSize; i++){
            System.out.print(arr[i] + " ");
        }
                
    }
}