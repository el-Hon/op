import java.util.Date;



public class Account {
    private int id = 0;
    private double balance = 0;
    private double ains = 0;
    private Date dc;
    public Account (){}
    public Account (int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    public int getid() {
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAins(){
        return ains;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAins(double ains){
        this.ains=ains;
    }
    public Date getDc(){
        return dc;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.print("You've successfully withdrawn: " + amount+ "\n");
            System.out.print("New balance: " + balance + "\n");
        }
        else{
            System.out.println("You do not have enough money" + "\n");
        }
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.print("New balance: " + balance + "\n");
    }
    public double getmonthly (){
        double x = ains / 100;
        double month = x/12;
        double montylyin = balance*month;
        return montylyin;
    }
}