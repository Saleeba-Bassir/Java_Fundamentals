import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
    int sum = 0;
    for(int i =1 ;i<=10;i++){
        sum +=i;
    }
    return sum ;
    }
    public double getOrderTotal(double[] prices) {
        double sum =0;
        for (double price : prices){
            sum += price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i =0; i< menuItems.size();i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello "+ userName + "!");
        int numAhead = customers.size();
        System.out.println(" You have "+ " " + numAhead +" " + " in queue ");
        customers.add(userName);
        System.out.println(customers);
    }
}
