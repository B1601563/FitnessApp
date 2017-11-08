package Week8N9N10N11GUI;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author celine_yin
 */
public class Table implements Serializable {
    private int tableNo;
    private int seatingCapacity;
    private String currentStatus;
    private int xPos;               // each table has a location
    private int yPos;
    private ArrayList<Order> tableOrders;

    public Table(int tableNo, int seatingCapacity, int xPos, int yPos) {
        this.tableNo = tableNo;
        this.seatingCapacity = seatingCapacity;
        this.currentStatus = "available";
        this.xPos = xPos;
        this.yPos = yPos;
        tableOrders = new ArrayList<>();
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public ArrayList<Order> getTableOrders() {
        return tableOrders;
    }

    public void setTableOrders(ArrayList<Order> tableOrders) {
        this.tableOrders = tableOrders;
    }

    @Override
    public String toString() {
        return "TableNo " + tableNo + ", seatingCapacity " + seatingCapacity + ", currentStatus " + currentStatus + ", xPos " + xPos + ", yPos=" + yPos + ", tableOrders " + tableOrders;
    }
    
    // add the method createNewOrder()
    public Order addOrderToTable(int numPax){
        Order newOrder = new Order(this, numPax);
        tableOrders.add(newOrder);
        setCurrentStatus("occupied");       // table is occupied
        return newOrder;
    }
   
    // add this method to get the orders form ONE table
    public ArrayList<Order> getOrders() {
        return tableOrders;
    }
   
}
