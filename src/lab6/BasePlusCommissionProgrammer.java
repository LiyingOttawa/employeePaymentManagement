/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: A BasePlusCommissionProgrammer is a CommissionProgrammer who is paid by baseSalary plus commission
 */
package lab6;
/**
 * This class is named BasePlusCommissionProgrammer Class. 
 * It is the subclass of CommissionProgrammer class.
 * It inheritances properties and behaviors from it super class.
 * It override getPaymentAmount() and toString()
 * As a BasePlusCommissionProgrammer,other than inherited properties,  the specific properties include base salary
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {
	/***
	 * base salary per week
	 */
	private double baseSalary; // base salary per week

	/**
	   *constructor with parameters
	   *@param firstName the first name of this programmer
	   *@param lastName the last name of this programmer
	   *@param socialSecurityNumber the social security number
	   *@param	month the month employed
	   *@param year the year employed
	   *@param grossSales the gross sales for the week
	   *@param commissionRate the commission rate
	   *@param baseSalary the base salary for a week
	*/
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month,
			int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * set the base salary for the programmer.
	 * if less than 0, throw exception
	 * 
	 * @param baseSalary the base salary of the week
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * Returns the base salary
	 * 
	 * @return the base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * calculate earnings; override method getPaymentAmount in CommissionProgrammer
	 * Returns the amount of payment for the week
	 * 
	 * @return the amount of payment for the week
	 */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	/**
	 * Returns the String representation of BasePlusCommissionProgrammer object
	 * 
	 * @return the String representation of BasePlusCommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(
				"""
				%s: %s %s
				social security number: %s
				gross sales: $%.2f; commission rate: %.2f; base salary: $%.2f
				""",
				"base-plus commission programmer",getFirstName(), getLastName(),
				getSocialSecurityNumber(),
				getGrossSales(), getCommissionRate(), getBaseSalary()
							);
	} 
}
