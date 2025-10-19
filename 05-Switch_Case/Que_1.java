class Answer_1 {
    public static void main(String[] args) {

        String traffic_clr = "Blue";

        switch (traffic_clr){

            case "Red" : System.out.println("Stop");
                        break;
            
            case "Yellow" : System.out.println("Start Vehical");
                        break;
            
            case "Green" : System.out.println("Goo");
                        break;
            
            default : System.out.println("No such colour present in Traffic Lights ");
        }
    }
}