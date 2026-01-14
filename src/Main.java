import client.IndividualClient;
import client.ProfessionalClient;
import shop.ShoppingCart;
import shop.ShoppingCartCalculator;
import utils.ProductType;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Worldline Product Store");

    System.out.println("Select Client Type:");
    System.out.println("1. Individual Client");
    System.out.println("2. Professional Client");

    int clientType = scanner.nextInt();

    ShoppingCart cart = new ShoppingCart();

    scanner.nextLine();
    ShoppingCartCalculator calculator = new ShoppingCartCalculator();
    double total;

    if (clientType == 1) {

      System.out.print("Enter Client ID: ");
      String id = scanner.nextLine();

      System.out.print("Enter First Name: ");
      String firstName = scanner.nextLine();

      System.out.print("Enter Last Name: ");
      String lastName = scanner.nextLine();

      productSelection(scanner, cart);

      IndividualClient client =
        new IndividualClient(id, firstName, lastName);

      total = calculator.calculateTotal(client, cart);

    } else if (clientType == 2) {

      System.out.print("Enter Client ID: ");
      String id = scanner.nextLine();

      System.out.print("Enter Company Name: ");
      String companyName = scanner.nextLine();

      System.out.print("Enter Annual Revenue: ");
      double revenue = scanner.nextDouble();

      //After capturing client details, ask the client to select the product
      productSelection(scanner, cart);

      ProfessionalClient client =
        new ProfessionalClient(id, companyName, revenue);

      total = calculator.calculateTotal(client, cart);

    } else {
      System.out.println("Invalid client type");
      scanner.close();
      return;
    }

    System.out.println("\nShopping Cart Total: " + total);

    scanner.close();
  }

  private static void productSelection(Scanner scanner, ShoppingCart cart) {

    System.out.println("\nAdd products to cart by entering the quantity:");

    System.out.print("High-range Phone quantity: ");
    int highEndQty = scanner.nextInt();
    if (highEndQty > 0) {
      cart.addProduct(ProductType.HIGH_RANGE_PHONE, highEndQty);
    }

    System.out.print("Mid-range Phone quantity: ");
    int midRangeQty = scanner.nextInt();
    if (midRangeQty > 0) {
      cart.addProduct(ProductType.MID_RANGE_PHONE, midRangeQty);
    }

    System.out.print("Laptop quantity: ");
    int laptopQty = scanner.nextInt();
    if (laptopQty > 0) {
      cart.addProduct(ProductType.LAPTOP, laptopQty);
    }

    scanner.close();
  }
}
