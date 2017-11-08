
package Week8N9N10N11GUI;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author celine_yin
 */
public class Order implements Comparable<Order>, Serializable {
    private static int nextNo = 500;
    private int orderNo;
    private LocalDateTime orderTime;
    private String status;
    private int numPax;
    private Table theTable;
    private ArrayList<OrderItem> orderedItems;      // add collection

    public Order(Table theTable, int numPax) {
        setOrderNo(nextNo++);
        this.numPax = numPax;
        this.theTable = theTable;
        this.orderTime = LocalDateTime.now();
        this.status = "new";
        this.orderedItems = new ArrayList<>();          // create collection
    }

    public static int getNextNo() {
        return nextNo;
    }

    public static void setNextNo(int next) {
        nextNo = next;
    }
    
    // sort orders by orderNo
    @Override
    public int compareTo(Order od) {
        return this.orderNo - od.orderNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumPax() {
        return numPax;
    }

    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }

    public Table getTable() {
        return theTable;
    }

    public void setTable(Table theTable) {
        this.theTable = theTable;
    }

    @Override
    public String toString() {
        return "OrderNo " + orderNo + ", with orderTime " + orderTime + ", status " + status + ", numPax " + numPax + ", tableNo " + theTable.getTableNo();
    }

    public OrderItem addOrderItem(MenuItem theMenuItem, int quantity, String specialRequest){
        OrderItem oi = new OrderItem(this, theMenuItem, quantity, specialRequest);
        if (orderedItems.contains(oi))      // already ordered
            return null;
        orderedItems.add(oi);
        return oi;
    }

    public Table getTheTable() {
        return theTable;
    }

    public void setTheTable(Table theTable) {
        this.theTable = theTable;
    }

    public ArrayList<OrderItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(ArrayList<OrderItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    // a method to calculate the total for the orer
    // (all ordered items)
    public double getTotal(){
        double total = 0.0;
        for (OrderItem oi: orderedItems) {
            total += oi.getTotal();         // total for each ordered item
        }
        return total;
    }
    
    public boolean removeItem(OrderItem unwanted){
        return orderedItems.remove(unwanted);           // use ArrayList method
    }
    
    public void updateCompleteStatus(){
        ArrayList<OrderItem> orderedItems = this.getOrderedItems();
        boolean allComplete = true;
        for (OrderItem oi: orderedItems) {
            if (!oi.getStatus().equals("Completed"))
                allComplete = false;
        }
        if (allComplete != false) {
            this.setStatus("Completed");
        }
    }

}
