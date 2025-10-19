// buy Subscription according to the plan chosen

class Answer_7 {
    public static void main(String[] args) {

        String plan = "gold";

        switch (plan) {
            case "platinum" : System.out.println("Subscription Cost: 799");
                    break;

            case "gold" : System.out.println("Subscription Cost: 599");
                    break;

            case "silver" : System.out.println("Subscription Cost: 399");
                    break;
            
            case "bronze" : System.out.println("Subscription Cost: 199");
                    break;
            
            default : System.out.println("Free Subscription with limited access");
        }
    }
}