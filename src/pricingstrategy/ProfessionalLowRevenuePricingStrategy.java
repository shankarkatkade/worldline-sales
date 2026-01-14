package pricingstrategy;

import utils.PricingConstants;
import utils.ProductType;
import java.util.Map;

/*
 * This class defines the pricing strategy for a Professional low revenue client
 * */
public class ProfessionalLowRevenuePricingStrategy implements PricingStrategy {

  @Override
  public double calculateTotal(Map<ProductType, Integer> items) {
    double sum = 0.0;
    for (Map.Entry<ProductType, Integer> item : items.entrySet()) {
      switch (item.getKey()) {
        case HIGH_RANGE_PHONE -> sum = (sum + PricingConstants.PRO_LOW_HIGH_END_PHONE * item.getValue());
        case MID_RANGE_PHONE -> sum = (sum + PricingConstants.PRO_LOW_MID_RANGE_PHONE * item.getValue());
        case LAPTOP -> sum = (sum + PricingConstants.PRO_LOW_LAPTOP * item.getValue());
      }
    }
    return sum;
  }

}