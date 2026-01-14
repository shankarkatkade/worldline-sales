package client;

/**
 * This class is to model the Professional Client details
 */
public class ProfessionalClient {

  private final String clientId;
  private final String companyName;
  private final double annualRevenue;

  /**
   * Instantiates a new Professional client.
   *
   * @param clientId      the client id
   * @param companyName   the company name
   * @param annualRevenue the annual revenue
   */
  public ProfessionalClient(String clientId, String companyName, double annualRevenue) {
    this.clientId = clientId;
    this.companyName = companyName;
    this.annualRevenue = annualRevenue;
  }

  /**
   * Gets client id.
   *
   * @return the client id
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * Gets company name.
   *
   * @return the company name
   */
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Gets annual revenue.
   *
   * @return the annual revenue
   */
  public double getAnnualRevenue() {
    return annualRevenue;
  }
}
