import java.lang.*;

class Answer_9 {
    public static void main ( String[] args) {

        int sub1 = 50;
        int sub2 = 60;
        int sub3 = 70;
        int sub4 = 80;
        int sub5 = 70;

        if ( sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 < 35 || sub5 < 35 ) {

            System.out.println("You Failed the exam.");

        } else {

            int result = sub1 + sub2 + sub3 + sub4 + sub5 ;
            int grade;

            if( result >= 75) {
                grade = 1;
            } else if ( result < 75 && result >= 55) {
                grade = 2;
            } else {
                grade = 3;
            }

            switch ( grade ) {
                case 1 : 
                        System.out.println("Distinction");
                        break;
                case 2 : 
                        System.out.println("First class");
                        break;
                case 3 : 
                        System.out.println("Second class");
                        break;
                default : 
                        break;
            }
        }
    }
}