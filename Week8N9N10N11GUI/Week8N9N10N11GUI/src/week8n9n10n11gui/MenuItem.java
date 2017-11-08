
package Week8N9N10N11GUI;

import java.io.Serializable;

/**
 *
 * @author celine_yin
 */
public class MenuItem implements Serializable {
    private static int nextNo = 100;
    private int itemNo;
    private String description;
    private double price;

    public MenuItem(String description, double price) {
        setItemNo(nextNo++);
        this.description = description;
        this.price = price;
    }

    public static int getNextNo() {
        return nextNo;
    }

    public static void setNextNo(int next) {
        nextNo = next;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "itemNo=" + itemNo + ", description=" + description + ", price=" + price + '}';
    }
    
    
    
    public static void main(String[] args){
        MenuItem item = new MenuItem("desc", 90);
        System.out.println(item);
        MenuItem item2 = new MenuItem("desc2", 80);
        System.out.println(item2);
    }
    
}
