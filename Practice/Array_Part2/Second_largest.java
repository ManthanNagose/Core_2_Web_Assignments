
class Sec_Largest_ele {
    public static void main(String[] args){
        int arr[] = new int[] {50, 40, 30, 20, 10, 20};

        int maxi = Integer.MIN_VALUE;
        int sLarge=0;
        for(int i=0; i<arr.length; i++){
            if ( arr[i] > maxi){
                sLarge = maxi;
                maxi = arr[i];
            } else if( arr[i] > sLarge && arr[i] != maxi){
                sLarge = arr[i];
            }
        }
        System.out.println(sLarge);
    }
}