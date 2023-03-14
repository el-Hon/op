import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(20102164, 20000);
        a1.setAins(4.5);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        double a = input.nextDouble();
        a1.withdraw(a);
        System.out.println("Enter the amount to deposit");
        double b = input.nextDouble();
        a1.deposit(b);
        double test = a1.getmonthly();
        System.out.println("Your monthly interest is: " +test );


    }
}