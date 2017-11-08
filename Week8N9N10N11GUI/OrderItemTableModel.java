package Week8N9N10N11GUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author celine_yin
 */
public class OrderItemTableModel extends AbstractTableModel {
    private static final String[] colHeader = {"Menu Item", "Quantity", "Special Request", "Status"};
    private ArrayList<OrderItem> orderItems;
    
    // constructor to set the model to an new (empty) arraylist by default
    public OrderItemTableModel() {
        setOrderItems(new ArrayList<OrderItem>());
    }
    
    // methods to get and set the orderItems for the tableModel
    public OrderItem getOrderAt(int index) {
        OrderItem theOrderItem = (OrderItem) orderItems.get(index);
        return theOrderItem;
    }
    
    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    @Override
    public int getRowCount(){
        return orderItems.size();
    }
    
    @Override
    public int getColumnCount() {
        return colHeader.length;
    }
    
    public String getColumnName(int column){
        return colHeader[column];
    }
    
    @Override
    // the method to determine what values are shown in the table
    public Object getValueAt(int rowIndex, int columnIndex) {
        OrderItem theOrderItem = (OrderItem) orderItems.get(rowIndex);
        MenuItem mi = theOrderItem.getTheMenuItem();
        switch(columnIndex){
            case 0: return mi.getItemNo() + " " + mi.getDescription();
            case 1: return new Integer(theOrderItem.getQuantity());
            case 2: return theOrderItem.getSpecialRequest();
            case 3: return theOrderItem.getStatus();
            default: return "";
        }
    }

}
