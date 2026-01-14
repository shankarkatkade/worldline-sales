package pricingstrategy;

import utils.PricingConstants;
import utils.ProductType;
import java.util.Map;

/*
* This class defines the pricing strategy for an Individual client
* */
public class IndividualPricingStrategy implements PricingStrategy {

  @Override
  public double calculateTotal(Map<ProductType, Integer> items) {
    double sum = 0.0;
    for (Map.Entry<ProductType, Integer> item : items.entrySet()) {
      switch (item.getKey()) {
        case HIGH_RANGE_PHONE -> sum = (sum + PricingConstants.INDIVIDUAL_HIGH_END_PHONE * item.getValue());
        case MID_RANGE_PHONE -> sum = (sum + PricingConstants.INDIVIDUAL_MID_RANGE_PHONE * item.getValue());
        case LAPTOP -> sum = (sum + PricingConstants.INDIVIDUAL_LAPTOP * item.getValue());
      }
    }
    return sum;
  }
}