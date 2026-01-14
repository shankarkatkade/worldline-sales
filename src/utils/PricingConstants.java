package utils;

/**
 * The type Pricing constants.
 */
public final class PricingConstants {

  private PricingConstants() {}

  /**
   * The constant REVENUE_THRESHOLD.
   */
// Revenue Threshold to decide the prices for professional clients
  public static final double REVENUE_THRESHOLD = 10000000;

  /**
   * The constant INDIVIDUAL_HIGH_END_PHONE.
   */
// Individual prices
  public static final int INDIVIDUAL_HIGH_END_PHONE = 1500;
  /**
   * The constant INDIVIDUAL_MID_RANGE_PHONE.
   */
  public static final int INDIVIDUAL_MID_RANGE_PHONE = 800;
  /**
   * The constant INDIVIDUAL_LAPTOP.
   */
  public static final int INDIVIDUAL_LAPTOP = 1200;

  /**
   * The constant PRO_HIGH_HIGH_END_PHONE.
   */
// Professional greater than 10 million
  public static final int PRO_HIGH_HIGH_END_PHONE = 1000;
  /**
   * The constant PRO_HIGH_MID_RANGE_PHONE.
   */
  public static final int PRO_HIGH_MID_RANGE_PHONE = 550;
  /**
   * The constant PRO_HIGH_LAPTOP.
   */
  public static final int PRO_HIGH_LAPTOP = 900;

  /**
   * The constant PRO_LOW_HIGH_END_PHONE.
   */
// Professional less than 10 million
  public static final int PRO_LOW_HIGH_END_PHONE = 1150;
  /**
   * The constant PRO_LOW_MID_RANGE_PHONE.
   */
  public static final int PRO_LOW_MID_RANGE_PHONE = 600;
  /**
   * The constant PRO_LOW_LAPTOP.
   */
  public static final int PRO_LOW_LAPTOP = 1000;
}