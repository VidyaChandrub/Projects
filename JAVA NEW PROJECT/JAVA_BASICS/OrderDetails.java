public class OrderDetails {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java OrderDetails <order_id> <item_name> <quantity> <total_cost>");
            return;
        }

        // Parse command line arguments
        String orderId = args[0];
        String itemName = args[1];
        //int quantity = Integer.parseInt(args[2]);
        double totalCost = Double.parseDouble(args[3]);

        // Print the order details
        System.out.printf("Order[%s]: %d of %s for a total of Rs%.2f%n", orderId, quantity, itemName, totalCost);
    }
}
