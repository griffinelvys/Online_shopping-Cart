import java.util.Scanner;
public class ShoppingCartManager {

    public static void printMenu(ShoppingCart shoppingCart, Scanner scnr) {

        String Input;
        int q = 0;
        int skipMenu = 0;
        do {

            if (skipMenu == 0) {
                System.out.println("MENU");
                System.out.println("a - Add item to cart");
                System.out.println("d - Remove item from cart");
                System.out.println("c - Change item quantity");
                System.out.println("i - Output items' descriptions");
                System.out.println("o - Output shopping cart");
                System.out.println("q - Quit\n");
                System.out.println("Choose an option:");

            }

            Input = scnr.next();

            if (Input.equals("a")) {
                scnr.nextLine();
                System.out.println("ADD ITEM TO CART");

                System.out.println("Enter the item name:");

                String name = scnr.nextLine();

                System.out.println("Enter the item description:");

                String itemDescription = scnr.nextLine();

                System.out.println("Enter the item price:");

                int itemPrice = scnr.nextInt();

                System.out.println("Enter the item quantity:");

                int quantity = scnr.nextInt();
                System.out.println("");
                scnr.nextLine();

                ItemToPurchase item = new ItemToPurchase(name, itemDescription, itemPrice, quantity);

                shoppingCart.addItem(item);
                skipMenu = 0;

            } else if (Input.equals("d")) {
                scnr.nextLine();
                System.out.println("REMOVE ITEM FROM CART");

                System.out.println("Enter name of item to remove:");

                String name = scnr.nextLine();
                shoppingCart.removeItem(name);
                skipMenu = 0;

            } else if (Input.equals("c")) {
                scnr.nextLine();
                System.out.println("CHANGE ITEM QUANTITY");

                System.out.println("Enter the item name:");

                String name = scnr.nextLine();

                System.out.println("Enter the new quantity:");

                int quantity = scnr.nextInt();

                ItemToPurchase item = new ItemToPurchase();

                item.setItemQuantity(quantity);

                shoppingCart.modifyItem(item);
                skipMenu = 0;
            } else if (Input.equals("i")) {
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");

                shoppingCart.printDescriptions();
                skipMenu = 0;

            } else if (Input.equals("o")) {
                System.out.println("OUTPUT SHOPPING CART");

                shoppingCart.printTotal();
                skipMenu = 0;

            } else if (Input.equals("q")) {
                q = 1;
                skipMenu = 0;
            } else {
                System.out.println("Choose an option:");
                skipMenu = 1;
            }
        } while (q != 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChar;

        System.out.println("Enter Customer's Name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter Today's Date:");
        String currentDate = scanner.nextLine();
        System.out.println("");

        ShoppingCart s = new ShoppingCart();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Today's Date: " + currentDate);
        System.out.println("");
        ShoppingCart shoppingCart = new ShoppingCart(customerName, currentDate);
        printMenu(shoppingCart, scanner);

    }
}