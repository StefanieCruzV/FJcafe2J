public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 4.5;
        double lattePrice = 3.8;
        double cappuccinoPrice =4.2;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(isReadyOrder1 ? readyMessage + displayTotalMessage +  dripPrice : pendingMessage);
        System.out.println(generalGreeting + customer2);
        System.out.println(isReadyOrder2 ? readyMessage + displayTotalMessage +  cappuccinoPrice : pendingMessage);
        System.out.println(generalGreeting + customer3);
        System.out.println(isReadyOrder3 ? readyMessage + displayTotalMessage +  (lattePrice*2) :pendingMessage);
        System.out.println(generalGreeting + customer4);
        System.out.println(isReadyOrder4 ? readyMessage + displayTotalMessage +  (dripPrice - lattePrice) : pendingMessage);

    }   
}
