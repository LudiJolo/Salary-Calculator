import java.util.HashMap;
import java.util.Random;

public class SalaryCalculator{
    /*************
     * Variables *
     *************/
    //Global Variable
    private static final double TAX = 0.15;
    //Random Generator
    Random rand = new Random();

    //Private Variables
    private int Salary;
    private HashMap<String, Integer> Expenses; //name: amount
    private int ExpenseTotal;


    /***********
     * Methods *
     **********/

    /* Constructors */
    public SalaryCalculator(){
        this.Salary = 0;
        this.Expenses = new HashMap<String, Integer>();
        this.ExpenseTotal = 0;
    }
    public SalaryCalculator(int salary){
        this.Salary = salary;
        this.Expenses = new HashMap<String, Integer>();
        this.ExpenseTotal = 0;
    }
    public SalaryCalculator(int salary, HashMap<String, Integer> expenses){
        this.Salary = salary;
        this.Expenses = expenses;
        this.ExpenseTotal = getExpenseSum();
    }

    /**
     * void addExpense(String, Integer)
     * @param name
     * @param newItem
     * - adds a new Expense HashMap element
     * - adds the total expense variable
     */
    public void addExpense(String name, Integer newItem){
        this.Expenses.put(name, newItem);
        this.ExpenseTotal += newItem;
    }

    /**
     * void deleteExpense(String)
     * @param name
     * - removes an element by searching using the Name key
     */
    public void deleteExpense(String name){
        if(!this.Expenses.isEmpty()){
            this.ExpenseTotal -= this.Expenses.get(name);
            this.Expenses.remove(name);
        }
    }

    /**
     * int getExpenseSum()
     * @return sum
     * - computes the total numerical values from the HashMap
     */
    public int getExpenseSum(){
        int sum=0;
        for(double i: this.Expenses.values()){
            sum+=i;
        }
        return sum;
    }

    /**
     * public int getSalary
     * @return int salary
     */
    public int getSalary(){
        return Salary;
    }

    //returns the HashMap Expenses variable
    public HashMap<String, Integer> getExpenses(){
        return this.Expenses;
    }

    /**
     * double getRemainingIncome()
     * @return Salary - Annual expenses
     * - calculates remaining income by deducting the overall expenses
     */
    public double getRemainingIncome(){
        return this.Salary - (getExpenseSum()*12);
    }

    //Deducts with tax percentage
    public double getRemainingIncome_withTax(){
        return afterTax(this.Salary) - (getExpenseSum()*12);
    }

    /**
     * double getPercentage
     * - returns the portion of the total expense from the salary
     * based on percentage value
     */
    public double getPercentage(){
        return ((getExpenseSum()*12)/ (double)this.Salary)*100;
    }

    //applies with tax percentage
    public double getPercentageAfterTax(){
        return ((getExpenseSum()*12)/ afterTax(this.Salary))*100;
    }

    //helper function
    //returns salary when deducted by tax percentage
    public double afterTax(double salary){
        return this.Salary-(this.Salary*TAX);
    }
}