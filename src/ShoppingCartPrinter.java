import java.util.Scanner;

class ShoppingCartPrinter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String item1 = "";
        String item2 = "";
        int price1      = 0;
        int price2      = 0;
        int quantity1   = 0;
        int quantity2   = 0;

        ItemToPurchase itemDtl1 = new ItemToPurchase();
        ItemToPurchase itemDtl2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemDtl1.setItemName(scanner.nextLine());

        System.out.println("Enter the item price:");
        itemDtl1.setItemPrice(scanner.nextInt());

        System.out.println("Enter the item quantity:");
        itemDtl1.setItemQuantity(scanner.nextInt());
        System.out.println();

        System.out.println("Item 2");
        itemDtl2.setItemName(scanner.nextLine());
        System.out.println("Enter the item name:");
        itemDtl2.setItemName(scanner.nextLine());

        System.out.println("Enter the item price:");
        itemDtl2.setItemPrice(scanner.nextInt());

        System.out.println("Enter the item quantity:");
        itemDtl2.setItemQuantity(scanner.nextInt());
        System.out.println();

        System.out.println("TOTAL COST");

        System.out.println(itemDtl1.getItemName() + " " + itemDtl1.getItemQuantity() + " @ $" +
                itemDtl1.getItemPrice() + " = $" + (itemDtl1.getItemPrice() * itemDtl1.getItemQuantity()));

        System.out.println(itemDtl2.getItemName() + " " + itemDtl2.getItemQuantity() + " @ $" +
                itemDtl2.getItemPrice() + " = $" + (itemDtl2.getItemPrice() * itemDtl2.getItemQuantity()));

        System.out.println();

        System.out.println("Total: $" + ((itemDtl1.getItemPrice() * itemDtl1.getItemQuantity()) +
                (itemDtl2.getItemPrice() * itemDtl2.getItemQuantity())));

    }
}