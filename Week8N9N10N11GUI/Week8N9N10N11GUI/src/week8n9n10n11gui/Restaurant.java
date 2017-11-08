
package Week8N9N10N11GUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author celine_yin
 */
public class Restaurant implements Serializable {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<Table> tables;

    public Restaurant() {
        menuItems = new ArrayList<>();
        tables = new ArrayList<>();
        setupTables();
    }
    
    public MenuItem findMenuItem(int itemNo){
        for (MenuItem anItem: menuItems) {
            if (anItem.getItemNo() == itemNo){
                return anItem;
            }
        }
        return null;
    }
    
    public MenuItem addMenuItem(String description, double price) {
        MenuItem theItem = new MenuItem(description, price);
        menuItems.add(theItem);
        return theItem;
    }
    
    public MenuItem updateItem(MenuItem theItem, String description, double price){
        for (MenuItem anItem: menuItems) {
            if (anItem == theItem){
                anItem.setDescription(description);
                anItem.setPrice(price);
                return anItem;
            }
        }
        return null;
    }
    
    public void addTable(int tableNo, int seatingCapacity, int xPos, int yPos) {
        Table t = new Table(tableNo, seatingCapacity, xPos, yPos);
        tables.add(t);
    }
    
    public ArrayList<Table>getTables() {
        return tables;
    }
    
    public void setupTables(){
        // create 16 tables in positions x = 10, 20, 30, 40, y = 10, 20, 30, 40
        int tableNo = 1;
        for (int y = 10; y <=250; y += 70)
        {
            for (int x = 10; x <= 250; x += 70)
            {
                int cap = (int) ((Math.random() * 6) + 2); // generate random capacity
                addTable(tableNo++, cap, x, y);
            }
        }
    }
    
    // add a method to find a table from the arraylist
    public Table getTable(int tableNo) {
        for (Table t:tables){
            if (t.getTableNo() == tableNo)
                return t;
        }
        return null;
    }
    
    // add the createNewOrder method
    public Order createNewOrder(int tableNo, int numPax) {
        Table theTable = getTable(tableNo);
        if (theTable == null)
            return null;
        return theTable.addOrderToTable(numPax);    // return the order created
    }
    
    // add this method to get all orders from ALL tables
    public ArrayList<Order> allOrders() {
        ArrayList<Order> orderList = new ArrayList<>();
        for (Table t: tables){
            orderList.addAll(t.getOrders());
        }
        return orderList;
    }
    
    // add this method to update sequences based on existing menu item number etc
    public void updateSequences(){
        ArrayList<Order> orders = allOrders();
        // Must sort all orders because they may be based on table
        Collections.sort(orders);               // implement Comparable for Order
        
        int lastIndex = orders.size() - 1;
        if (lastIndex >= 0)
            Order.setNextNo(orders.get(lastIndex).getOrderNo()+1);
        else
            Order.setNextNo(500);       // no existing orders
        
        // Menu items should already be in order
        lastIndex = menuItems.size() - 1;
        if (lastIndex >= 0)
            MenuItem.setNextNo(menuItems.get(lastIndex).getItemNo()+1);
        else
            MenuItem.setNextNo(100);        // no existing menu items
    }
}
