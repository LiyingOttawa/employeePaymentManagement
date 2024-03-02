/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-18
 * Professor: Sandra Iroakazi
 * Purpose: A Programmer is a supertype for an instance of SalariedProgramer/HourlyProgrammer/CommissionProgrammer
 */
package lab6;
/**
 * This class is named SalariedProgrammer Class. 
 * This is an abstract superclass that IMPLEMENTS the Payme interface.
 * It is the superclass of SalariedProgramer, HourlyProgrammer and CommissionProgrammer
 * As a programmer, the properties include first name, last name, social security number, employed month and year
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
 */
public abstract class Programmer implements Payme{

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private int month;
	private int year;

	/**
	   *
	   *@param first the first name of this programmer
	   *@param last the last name of this programmer
	   *@param ssn the social security number
	   *@param month the month employed
	   *@param year the year employed
	*/
	public Programmer(String first, String last, String ssn, int month, int year) {
		 firstName = first;
		 lastName = last;
		 socialSecurityNumber = ssn;
		 this.month = month;
		 this.year = year;
	}
	
	/**
	 * Gets the first name of programmer
	 * @return the first name of programmer
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the first name of programmer 
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of programmer
	 * @return the last name of programmer
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the last name of programmer 
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the social security number of programmer
	 * @return the social security number of programmer
	*/
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * @param socialSecurityNumber the social security number of programmer
	*/
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Gets the month the programmer was hired
	 * @return the month the programmer was hired
	*/
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month the programmer was hired
	*/
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Gets the year the programmer was hired
	 * @return the year the programmer was hired
	*/
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year the programmer was hired
	*/
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Returns the String representation of Programmer object
	 * 
	 * @return the String representation of Programmer object
	 */
	@Override
	public String toString() {
		return String.format(
				"""
				%s: %s %s
				social security number: %s
				""",
				"programmer",getFirstName(), getLastName(),
				getSocialSecurityNumber()
				);
	} 
	
	/***
	 * NOT implement Payme method getPaymentAmount() here
	 * TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS abstract
	 */
	public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 
	
	
