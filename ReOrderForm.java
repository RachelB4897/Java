
import java.util.Scanner;

public class ReOrderForm {

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to my Reorder Form.");
        System.out.println();
        
        // declare scanner to accept input
        Scanner input = new Scanner(System.in);
        
        //declaring vars
        int itemsEntered = 0;
        int itemsReorder = 0;
        double itemID;
        String itemDesc;
        int quantity;
        
        // accept input from user until user answers Y for completion
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            // get input from user
            System.out.print("Enter ItemID:");
            itemID = input.nextDouble();
            System.out.print("Enter Item Description:");
            itemDesc = input.next();
            System.out.print("Enter Quantity on Hand:");
            quantity = input.nextInt();
            
            // if quantity of items is less than 20, note to reorder 
            if (quantity < 20){
                System.out.println("We will need to note " + itemDesc + 
                        " for reorder.");
                itemsReorder++;
            }
            else {
                System.out.println("We seem to be in good supply of " + itemDesc);
            }
            // check for completetion
            System.out.println("Thank you for entering your items. Add more? "
                + "(Y/N)");
            choice = input.next();
            System.out.println();
            itemsEntered++;         
        }
        // final message with output numbers
        System.out.println("Thank you for using my reorder form. You entered "
                + itemsEntered + " items. You need to reorder " + itemsReorder 
                    + " items. Have a nice day.");
    }
}
