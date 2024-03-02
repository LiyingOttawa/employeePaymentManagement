/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: A HourlyProgrammer is a Programmer who is paid by hourWage and hoursWorked
 */
package lab6;
/**
 * This class is named HourlyProgrammer Class. 
 * It is the subclass of Programmer class.
 * It inheritances properties and behaviors from it super class.
 * It override getPaymentAmount() and toString()
 * As a HourlyProgrammer,other than inherited properties,  the specific properties include wage(hourly) and hours(worked)
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week
	
	/**
	   *
	   *@param firstName the first name of this programmer
	   *@param lastName the last name of this programmer
	   *@param socialSecurityNumber the social security number
	   *@param	month the month employed
	   *@param year the year employed
	   *@param wage the hourly wage
	   *@param hours the hours worked in the week
	*/
	public HourlyProgrammer(String firstName, String lastName,
		String socialSecurityNumber, int month, int year, 
		double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	} 
	
	/**
	 * set the wage hourly
	 * if less than 0, throw exception
	 * 
	 * @param wage the wage
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		this.wage = wage;
	} 
	
	/**
	 * Returns the wage hourly
	 * 
	 * @return the wage hourly
	 */
	public double getWage() {
		return wage;
	} 
	
	/**
	 * set the worked hours on the week
	 * if less than 0, throw exception
	 * 
	 * @param hours the worked hours the week
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.hours = hours;
	} 
	
	/**
	 * Returns the hours worked weekly
	 * 
	 * @return the hours worked weekly
	 */
	public double getHours() {
		return hours;
	} 
	
	/**
	 * calculate earnings; override method getPaymentAmount in Programmer
	 * Returns the amount of payment for the week
	 * 
	 * @return the amount of payment for the week
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
		  return getWage() * getHours();   
		}
		else {                                                             
		  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}                                          
	
	/**
	 * Returns the String representation of HourlyProgrammer object
	 * 
	 * @return the String representation of HourlyProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(
				"""
				%s: %s %s
				social security number: %s
				hourly wage: $%.2f; hours worked: %.2f
				""",
				"hourly Programmer",getFirstName(), getLastName(),
				getSocialSecurityNumber(),
				getWage(), getHours()
				);
	}                  
}

