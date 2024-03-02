/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: A SalariedProgrammer is a Programmer who is paid with fix weeklySalary
 */
package lab6;
/**
 * This class is named SalariedProgrammer Class. 
 * It is the subclass of Programmer class.
 * It inheritances properties and behaviors from it super class.
 * It override getPaymentAmount() and toString()
 * As a HourlyProgrammer,other than inherited properties,  the specific properties include weeklySalary
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;
	
	
	/**
	   *
	   *@param firstName the first name of this programmer
	   *@param lastName the last name of this programmer
	   *@param socialSecurityNumber the social security number
	   *@param	month the month employed
	   *@param year the year employed
	   *@param weeklySalary the weekly salary(fixed)
	*/
	public SalariedProgrammer(String firstName, String lastName, 
		String socialSecurityNumber, int month, int year, 
		double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year); 
	
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * set the weekly salary
	 * if less than 0, throw exception
	 * 
	 * @param weeklySalary the weekly salary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * Returns the weekly salary
	 * 
	 * @return the weekly salary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	/**
	 * calculate earnings; override method getPaymentAmount in Programmer
	 * Returns the amount of payment for the week
	 * 
	 * @return the amount of payment for the week
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             
	
	/**
	 * Returns the String representation of SalariedProgrammer object
	 * 
	 * @return the String representation of SalariedProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(
				"""
				%s: %s %s
				social security number: %s
				weekly salary: $%.2f
				""",
				"salaried Programmer",getFirstName(), getLastName(),
				getSocialSecurityNumber(),
				getWeeklySalary()
				);
	} 
}

