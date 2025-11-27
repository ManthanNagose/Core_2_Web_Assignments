import java.io.*;
class Array5 {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of Array: ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the elements in an array: ");
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the element to search in array: ");
        int ele = Integer.parseInt(br.readLine());

        boolean bool = false;
        int sum = 0;
        int idx = -1;
        for(int i=0; i<size; i++){
            if( arr[i] == ele){
                bool = true;
                idx = i;
                // break;
            }
            sum += arr[i];
        }

        System.out.println("Sum is : " + sum);

        if(bool == true){
            System.out.println("Element is present at Index: "+ (idx+1));
        }else{
            System.out.println("Element is not present in array.");
        }

        
    }
}
