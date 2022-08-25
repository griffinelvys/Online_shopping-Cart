public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase(){
        this.itemName = "none";
        this.itemDescription = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public void setItemName(String newItemName){
        this.itemName = newItemName;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemDescription(String newItemDescription){
        this.itemDescription = newItemDescription;
    }
    public String getItemDescription(){
        return itemDescription;
    }

    public void setItemPrice(int newItemPrice){
        this.itemPrice = newItemPrice;
    }

    public int getItemPrice(){
        return itemPrice;
    }

    public void setItemQuantity(int newItemQuantity){
        this.itemQuantity = newItemQuantity;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public void printItemCost(){
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" +
                itemPrice * itemQuantity);
    }

    public void printItemDescription(){
        System.out.println(itemName + ": " + itemDescription + ", " + itemQuantity + ".");
    }

}
