public class GroceryItemOrder {
    String ItemName;
    int ItemQuantity;
    double ItemPrice;

    public GroceryItemOrder(String itemName, double itemPrice) {
        ItemName = itemName;
        ItemQuantity = 1;
        ItemPrice = itemPrice;
    }


    public double getCost() {
        return ItemPrice*ItemQuantity;
    }

    public void setItemQuantity(int Quantity) {
        ItemQuantity = Quantity;
    }
}
