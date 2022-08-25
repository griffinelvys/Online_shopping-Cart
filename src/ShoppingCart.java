import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingCart {


    private String customerName;
    private String currentDate;
    private int Total;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    public void removeItem(String name) {
        while (!cartItems.isEmpty()) {
            for (int i = 0; i < cartItems.size(); ++i) {
                if (cartItems.get(i).getItemName().equals(name)) {
                    cartItems.remove(i);
                } else {
                    System.out.println("Item not found in cart. Nothing removed.");
                    System.out.println("");
                    break;
                }
            }
            break;
        }
    }

    public void modifyItem(ItemToPurchase item) {
        boolean found = false;
        ;
        for (ItemToPurchase i : cartItems) {
            if (i.getItemName().equals(item.getItemName())) {
                if (i.getItemQuantity() != 0) {
                    i.setItemQuantity(item.getItemQuantity());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
            System.out.println("");
        }
    }

    public int getNumItemsInCart() {
        int sum = 0;
        for (ItemToPurchase i : cartItems) {
            sum = sum + i.getItemQuantity();
        }
        return sum;
    }

    public int getCostOfCart() {
        int sum = 0;
        for (ItemToPurchase i : cartItems) {
            sum = sum + i.getItemPrice() * i.getItemQuantity();
        }
        System.out.println("");
        System.out.println("Total: $" + sum);
        System.out.println("");
        return sum;
    }

    public void printTotal() {
        int Total = 0;
        if (cartItems != null && cartItems.size() > 0) {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            for (ItemToPurchase item : cartItems) {
                Total = Total + item.getItemQuantity();
            }
            System.out.println("Number of Items: " + Total);

            System.out.println();

            for (ItemToPurchase i : cartItems) {
                i.printItemCost();
            }
            getCostOfCart();
        } else {

            System.out.println(customerName + "'s Shopping Cart - " + currentDate);

            System.out.println("Number of Items: 0");

            System.out.println();
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println("");
            System.out.println("Total: $0");
            System.out.println("");
        }
    }

    public void printDescriptions() {

        System.out.println(customerName + "'s Shopping Cart - " + currentDate);

        System.out.println("");
        System.out.println("Item Descriptions");
        for (ItemToPurchase i : cartItems) {
            i.printItemDescription();
        }
        System.out.println("");
    }
}