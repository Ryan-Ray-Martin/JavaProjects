package edu.neu.ccs.cs5004.supermarket;

/**
 * A class that represents a beer grocery product.
 */
class Beer extends AbstractGroceryItem {

  /**
   * A constructor for a beer grocery product.
   *
   * @param productName         the name of the product
   * @param productManufacturer the manufacturer of the product
   * @param productPrice        the price of the product
   * @param productQuantity     the quantity of the product
   * @param minimumAgeToBuy     the minimum age requirement to buy the product
   * @param productWeight       the weight of the product
   */
  Beer(String productName, String productManufacturer, int productPrice,
      int productQuantity, int minimumAgeToBuy, double productWeight) {
    super(productName, productManufacturer, productPrice, productQuantity, minimumAgeToBuy,
        productWeight);
  }
}
