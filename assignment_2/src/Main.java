
public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");
        MyInteger m1 = new MyInteger(2);
        MyInteger m2 = new MyInteger(9);

        System.out.println(m1.isEven());
        System.out.println(MyInteger.isOdd(5));
        System.out.println(MyInteger.isPrime(m1));
        System.out.println(m1.equals(3));
        System.out.println(m1.equals(m2));

    }
}