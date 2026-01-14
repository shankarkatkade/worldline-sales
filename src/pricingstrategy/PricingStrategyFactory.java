package pricingstrategy;


import client.IndividualClient;
import client.ProfessionalClient;
import utils.PricingConstants;

/*
 * This class chooses the pricing strategy implementation for the client type
 * */
public class PricingStrategyFactory {

  /**
   * Gets strategy.
   *
   * @param client the client
   * @return the strategy
   */
  public static PricingStrategy getStrategy(IndividualClient client) {
    return new IndividualPricingStrategy();
  }

  /**
   * Gets strategy.
   *
   * @param client the client
   * @return the strategy
   */
  public static PricingStrategy getStrategy(ProfessionalClient client) {
    return client.getAnnualRevenue() > PricingConstants.REVENUE_THRESHOLD
      ? new ProfessionalHighRevenuePricingStrategy()
      : new ProfessionalLowRevenuePricingStrategy();
  }
}
