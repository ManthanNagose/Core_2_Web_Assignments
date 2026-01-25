class Max_Min_Array {
    public static void main(String[] args){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        int arr[] = new int[] { 10, 2 , 5 , 17 , 100, 31};

        for(int i=0; i<arr.length; i++){
            if( arr[i] < mini){
                mini = arr[i];
            }

            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }

        System.out.println("Max element is : " + maxi);
        System.out.println("Min element is : " + mini);

    }
}
