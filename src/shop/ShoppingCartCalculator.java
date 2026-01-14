package shop;

import client.IndividualClient;
import client.ProfessionalClient;
import pricingstrategy.PricingStrategy;
import pricingstrategy.PricingStrategyFactory;

/*
 * This class initiates the price calculations
 * */
public class ShoppingCartCalculator {

  /**
   * Calculate total double.
   *
   * @param client the client
   * @param cart   the cart
   * @return the double
   */
  public double calculateTotal(IndividualClient client, ShoppingCart cart) {
    PricingStrategy strategy = PricingStrategyFactory.getStrategy(client);
    return strategy.calculateTotal(cart.getItems());
  }

  /**
   * Calculate total double.
   *
   * @param client the client
   * @param cart   the cart
   * @return the double
   */
  public double calculateTotal(ProfessionalClient client, ShoppingCart cart) {
    PricingStrategy strategy = PricingStrategyFactory.getStrategy(client);
    return strategy.calculateTotal(cart.getItems());
  }
}
