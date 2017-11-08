package Week8N9N10N11GUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author celine_yin
 */
public class OrderTableModel extends AbstractTableModel{
    // set up the column headers
    private static final String[] colHeader = {"Order No", "Table No", 
        "Order Date", "Order Time", "Status"};
    
    // This model manages an array of order objects
    private ArrayList<Order> orders;

    public OrderTableModel(ArrayList<Order> orders) {
        setOrders(orders);
    }
    
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    @Override
    // number of rows is the size of the arraylist (all orders)
    public int getRowCount() {
        return orders.size();
    }
    
    @Override
    // number of columns follows the column header
    public int getColumnCount() {
        return colHeader.length;
    }
    
    // to fill in the values in the table cells
    public Object getValueAt(int rowIndex, int columnIndex) {
        Order theOrder = (Order) orders.get(rowIndex);
        switch(columnIndex) {
            case 0: return new Integer(theOrder.getOrderNo());
            case 1: return new Integer(theOrder.getTable().getTableNo());
            case 2: return theOrder.getOrderTime().toLocalDate();
            case 3: return theOrder.getOrderTime().getHour() + ":"
                    + theOrder.getOrderTime().getMinute();
            case 4: return theOrder.getStatus();
            default: return "";
        }
    }
    
    public String getColumnName(int column){
        return colHeader[column];
    }
    
    // to return the Order object at a specified row
    public Order getOrderAt(int index){
        Order theOrder = (Order) orders.get(index);
        return theOrder;
    }

}
