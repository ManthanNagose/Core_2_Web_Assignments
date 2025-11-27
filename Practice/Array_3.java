import java.io.*;

class Array3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of array: ");
        int arrSize = Integer.parseInt(br.readLine());
        
        int arr[] = new int[arrSize];

        System.out.println("Enter Data: ");
        for(int i=0; i<arrSize; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter a Number to find in array: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        boolean flag = false;

        for(int i=0; i<arrSize; i++){         
            if(num == arr[i] ){
                flag = true;
            }
            sum += arr[i];
        }

        if ( flag == true){
            System.out.println("Element is present.");
        }else{
            System.out.println("Element is Not Present.");
        }
        System.out.println("Sum of Array is : " + sum);

    }
    
}
