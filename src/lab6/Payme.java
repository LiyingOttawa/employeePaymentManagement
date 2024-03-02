/**
 * File name: Payme.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: Payme is a interface which is to associate unrelated classes(invoice and programmers)
 */
package lab6;

/**
 * This interface is named Payme. 
 * It is the interface implemented by two set of unrelated classes(invoice and programmer).
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public interface Payme {
	/**
	 * calculate payment amount; it is an abstract method in the interface
	 * Returns the amount of payment for the week
	 * 
	 * @return the amount of payment for the week
	 */
	double getPaymentAmount();
}
