
package Week8N9N10N11GUI;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author celine_yin
 */
public class OrderItem implements Serializable{
    private Order theOrder;
    private MenuItem theMenuItem;
    private int quantity;
    private String specialRequest;
    private String status;

    public OrderItem(Order theOrder, MenuItem mi, int qty, String req) {
        this.theOrder = theOrder;
        this.theMenuItem = mi;
        this.quantity = qty;
        this.specialRequest = req;
        this.status = "outstanding";
    }

    public Order getTheOrder() {
        return theOrder;
    }

    public void setTheOrder(Order theOrder) {
        this.theOrder = theOrder;
    }

    public MenuItem getTheMenuItem() {
        return theMenuItem;
    }

    public void setTheMenuItem(MenuItem theMenuItem) {
        this.theMenuItem = theMenuItem;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // add equals() method to check if the item ahs already been ordered
    // NetBeans generated (Alt. insert)
    // based on same order and item
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItem other = (OrderItem) obj;
        if (!Objects.equals(this.theOrder, other.theOrder)) {
            return false;
        }
        if (!Objects.equals(this.theMenuItem, other.theMenuItem)) {
            return false;
        }
        return true;
    }
    
    // A method to calculate the total ordered
    public double getTotal(){
        return theMenuItem.getPrice() * quantity;
    }
    
    @Override
    public String toString() {
        return "Item: " + theMenuItem.getItemNo() + " " + theMenuItem.getDescription() 
                + " Quantity Required: " + quantity + " Special Req: " + specialRequest + " Total price " + getTotal();
    }
    
}
