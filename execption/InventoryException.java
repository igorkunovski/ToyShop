/*Simple Exception class used in program*/

package execption;

public class InventoryException extends IllegalArgumentException{
    private static final String message = "Some prizes are out of stock!\n" +
            "It is impossible to hold a lottery until the inventory is appropriate!";

    static {
        System.err.println(message);
    }
}
