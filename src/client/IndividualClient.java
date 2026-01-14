package client;

/**
 * This class is to model the Individual Client details
 */
public class IndividualClient {

  private final String clientId;
  private final String firstName;
  private final String lastName;

  /**
   * Instantiates a new Individual client.
   *
   * @param clientId  the client id
   * @param firstName the first name
   * @param lastName  the last name
   */
  public IndividualClient(String clientId, String firstName, String lastName) {
    this.clientId = clientId;
    this.firstName = firstName;
    this.lastName = lastName;
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
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }
}
