// Print long form of Clothes Size

class Answer_3 {
    public static void main(String[] args) {

        String size = "XL";

        switch (size) {
            case "XS" : System.out.println("Extra Small");
                    break;

            case "S" : System.out.println("Small");
                    break;

            case "M" : System.out.println("Medium");
                    break;
            
            case "L" : System.out.println("Large");
                    break;
            
            case "XL": System.out.println("Extra Large");
                    break;
            
            case "XXL": System.out.println("Extra Extra Large");
                    break;

            default : System.out.println("Invalid Size of Cloth");
        }
    }
}