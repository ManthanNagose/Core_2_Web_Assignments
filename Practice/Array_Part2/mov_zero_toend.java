class Move_zero_toend {
    public static void main(String [] args){
        int arr[] = new int[]{ 10 , 20 , 0 , 0 , 30 , 0 , 50};

        int start = 0, end = arr.length -1;
        for(int i=0; i<arr.length; i++){
            if( arr[start] == 0 && arr[end] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++ ;
                end--;

            } else if(arr[start] != 0){
                start++;
            } else {
                end--;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
