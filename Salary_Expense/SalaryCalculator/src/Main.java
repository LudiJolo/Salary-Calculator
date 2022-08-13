import java.util.HashMap;
public class Main {
    public static void main(String[]args){
        //Initializing values
        HashMap<String, Integer> myExp = new HashMap<String, Integer>();
        int salary = 75000;

        //Adding expenses at any number
        myExp.put("Gas", 240);
        myExp.put("Rent", 2200);
        myExp.put("Grocery", 200);
        myExp.put("Internet", 100);

        //Finalizing/Calculating
        SalaryCalculator mySal = new SalaryCalculator(salary, myExp);

        /*
        System.out.println("Without tax");
        System.out.println(mySal.getRemainingIncome());
        System.out.println(mySal.getPercentage());

        System.out.println("With tax");
        System.out.println(mySal.getRemainingIncome_withTax());
        System.out.println(mySal.getPercentageAfterTax());
         */

        //initializes the main application
        MainFrame myFrame = new MainFrame();
        

    }
}
