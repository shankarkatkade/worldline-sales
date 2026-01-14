package tests;


import client.IndividualClient;
import client.ProfessionalClient;
import org.junit.jupiter.api.Test;
import shop.ShoppingCart;
import shop.ShoppingCartCalculator;
import utils.ProductType;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Shopping cart calculator test.
 */
public class ShoppingCartCalculatorTest {

  /**
   * Individual client total.
   */
  @Test
  void individualClientTotal() {
    //Client created
    IndividualClient client = new IndividualClient("1", "Shankar", "K");

    //Product added to cart
    ShoppingCart cart = new ShoppingCart();
    cart.addProduct(ProductType.HIGH_RANGE_PHONE, 1);

    //Calculate the total
    double total = new ShoppingCartCalculator().calculateTotal(client, cart);

    assertEquals(1500, total);
  }

  /**
   * Professional high revenue client total.
   */
  @Test
  void professionalHighRevenueClientTotal() {

    ProfessionalClient client = new ProfessionalClient("2", "Capco", 15000000);

    ShoppingCart cart = new ShoppingCart();
    cart.addProduct(ProductType.MID_RANGE_PHONE, 2);

    double total = new ShoppingCartCalculator().calculateTotal(client, cart);

    assertEquals(1100, total);
  }

  /**
   * Professional low revenue client total.
   */
  @Test
  void professionalLowRevenueClientTotal() {
    ProfessionalClient client = new ProfessionalClient("3", "Test Client", 5000000);

    ShoppingCart cart = new ShoppingCart();
    cart.addProduct(ProductType.HIGH_RANGE_PHONE, 1);

    double total = new ShoppingCartCalculator().calculateTotal(client, cart);

    assertEquals(1150, total);
  }

}