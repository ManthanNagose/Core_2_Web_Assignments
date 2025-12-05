class StringOpr {
    public static void main(String[] args){
    
        String str = "Core2Web";   // SCP
        
        System.out.println(System.identityHashCode(str));  // 1000
        str = str + " Manthan";                            // Heap
        System.out.println(System.identityHashCode(str));  // 2000
    }
}
