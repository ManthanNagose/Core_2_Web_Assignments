class StringBuffCapacityDemo {
    public static void main(String[] args){

        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("Shashi");
        StringBuffer str3 = new StringBuffer("Bagal");

        System.out.println(str1);      
        System.out.println(str2);      
        System.out.println(str3);      

        System.out.println();

        System.out.println(str1.capacity());    //16
        System.out.println(str2.capacity());    //22
        System.out.println(str3.capacity());    //21

        System.out.println();

        str1 = str1.append(str2);
        str2 = str2.append(str3);
        str3 = str3.append("Hellooooooooooooooo");

        System.out.println();

        System.out.println(str1.capacity());    //16
        System.out.println(str2.capacity());
        System.out.println(str3.capacity());


    }
    
}
