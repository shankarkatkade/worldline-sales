package pricingstrategy;

import utils.ProductType;
import java.util.Map;

/**
 * The interface Pricing strategy.
 */
public interface PricingStrategy {

  /**
   * Calculate total double.
   *
   * @param items the items
   * @return the double
   */
  double calculateTotal(Map<ProductType, Integer> items);

}