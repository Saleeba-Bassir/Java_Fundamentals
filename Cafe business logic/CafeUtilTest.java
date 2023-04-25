import java.util.ArrayList;

public class CafeUtilTest {
    
    public static void main(String[] args) {
        
        // Test Cases for getStreakGoal
        CafeUtil cafeUtil = new CafeUtil();
        int expectedStreakGoal = 55;
        int actualStreakGoal = cafeUtil.getStreakGoal();
        System.out.println("Streak Goal is: " + expectedStreakGoal);

        double[] prices = {7.50, 9.75, 5.00, 9.50};
        double actualTotal = cafeUtil.getOrderTotal(prices);
        System.out.println("your total is :"+ actualTotal);

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip coffee");
        menu.add("Latte");
        menu.add("Cappuccino");
        menu.add("Americano");
        menu.add("Mocha");
        menu.add("Espresso");
        System.out.println(menu);

        ArrayList<String> customers = new ArrayList<String>();
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        cafeUtil.addCustomer(customers);
        System.out.println(customers);
        }
    }
