import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItemOrder> list;
    int no_of_items = 0;

    public GroceryList() {}

    public void add(GroceryItemOrder item) {
        //if (list.size() <= 10) {
            list.add(item);
            no_of_items++;
        //}
    }
    public double getTotalCost () {
        double totalCost = 0;
        for (int i = 0; i < list.size(); i++) {
           totalCost += list.get(i).getCost();
        }
        return totalCost;
    }

}
