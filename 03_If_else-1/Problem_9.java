class Problem_9_Answer {
    public static void main(String[] args){

        int num = 7;

        switch(num) {
            case 1 : System.out.println("Monday");
                    break;
            case 2 : System.out.println("Tuesday");
                    break;
            case 3 : System.out.println("Wednesday");
                    break;
            case 4 : System.out.println("Thrusday");
                    break;
            case 6 : System.out.println("Friday");
                    break;
            case 7 : System.out.println("Saturday");
                    break;
            default : System.out.println("Day number must be between 1 to 7");
                    break;
        }
    }
}