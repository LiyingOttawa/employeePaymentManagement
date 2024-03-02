/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: A CommissionProgrammer is a Programmer who is paid by  commission
 */
package lab6;
/**
 * This class is named CommissionProgrammer Class. 
 * It is the subclass of Programmer class.
 * It inheritances properties and behaviors from it super class.
 * It override getPaymentAmount() and toString()
 * As a CommissionProgrammer,other than inherited properties,  the specific properties include grossSales and commissionRate
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public class CommissionProgrammer extends Programmer {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/**
	   *
	   *@param firstName the first name of this programmer
	   *@param lastName the last name of this programmer
	   *@param socialSecurityNumber the social security number
	   *@param	month the month employed
	   *@param year the year employed
	   *@param grossSales the gross sales for the week
	   *@param commissionRate the commission rate
	*/
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * set the gross sales in a week
	 * if less than 0, throw exception
	 * 
	 * @param grossSales the gross sale in a week
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/***
	 * 
	 * @return gross sales amount
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * set the commission rate
	 * if not between 0 and 1, throw exception
	 * 
	 * @param commissionRate the commission rate
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * Returns the commission rate
	 * 
	 * @return the commission rate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * calculate earnings; override method getPaymentAmount in Programmer
	 * Returns the amount of payment for the week
	 * 
	 * @return the amount of payment for the week
	 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}

	/**
	 * Returns the String representation of CommissionProgrammer object
	 * 
	 * @return the String representation of CommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(
				"""
				%s: %s %s
				social security number: %s
				gross sales: $%.2f; commission rate: %.2f
				""",
				"commission programmer",getFirstName(), getLastName(),
				getSocialSecurityNumber(),
				getGrossSales(), getCommissionRate()
				);
	} 
}
