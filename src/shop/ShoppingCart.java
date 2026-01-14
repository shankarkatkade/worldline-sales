package shop;

import utils.ProductType;
import java.util.HashMap;
import java.util.Map;

/*
* This class holds the product details selected by the client
* */
public class ShoppingCart {

  private final Map<ProductType, Integer> items = new HashMap<>();

  /**
   * Add product.
   *
   * @param product  the product
   * @param quantity the quantity
   */
  public void addProduct(ProductType product, int quantity) {
    items.merge(product, quantity, Integer::sum);
  }

  /**
   * Gets items.
   *
   * @return the items
   */
  public Map<ProductType, Integer> getItems() {
    return items;
  }
}