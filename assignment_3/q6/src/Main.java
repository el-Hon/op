public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GroceryList gl=new GroceryList();
        GroceryItemOrder i1=new GroceryItemOrder("apples",1.5);
        i1.setItemQuantity(2);
        gl.add(i1);

        GroceryItemOrder i2=new GroceryItemOrder("bananas",2.0);
        i2.setItemQuantity(3);
        gl.add(i2);
        System.out.println(gl.getTotalCost());
    }
}