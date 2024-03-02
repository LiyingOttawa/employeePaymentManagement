/**
 * File name: Invoice.java
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass
 * The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!
 */
package lab6;

/**
 * This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass
 * The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public class Invoice implements Payme {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	/***
	 * 
	 * @param part part number
	 * @param description part name
	 * @param count part amount purchased
	 * @param price part unit price
	 */
	public Invoice(String part, String description, int count, double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

	/***
	 * 
	 * @param part part number
	 */
	public void setPartNumber(String part) {
		partNumber = part; // should validate
	}

	/***
	 * 
	 * @return The part number
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/***
	 * 
	 * @param description part name
	 */
	public void setPartDescription(String description) {
		partDescription = description; // should validate
	}

	/***
	 * 
	 * @return the part name
	 */
	public String getPartDescription() {
		return partDescription;
	}
	
	/***
	 * 
	 * @param count the amount purchased on the part
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

	/***
	 * 
	 * @return the amount purchased on the part
	 */
	public int getQuantity() {
		return quantity;
	}

	/***
	 * 
	 * @param price the part unit price
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/***
	 * 
	 * @return the part unit price
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/***
	 *  String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f\n", "invoice", "part number", getPartNumber(),
				getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	}

	/***
	 * method required to carry out contract with interface Payme
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
