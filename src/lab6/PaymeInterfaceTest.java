/**
 * File name: PaymeInterfaceTest.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 6
 * Date: 2023-11-19
 * Professor: Sandra Iroakazi
 * Purpose: PaymeInterfaceTest is to test on interface on payme
 */
package lab6;

/**
 * This class is called the PaymeInterfaceTest Class and provides the main method for your program.
 * This program shows interface by implementing a method to objects of different classes. 
 * The implement is using an array. 
 * The order of the workers in the output are 2 Invoices, 1 SalariedProgrammer, 1 HourlyProgrammer, 1 CommissionProgrammer and 1 BasePlusCommissionProgrammer.
 * Use the values in the output sample file provided for me. 
 * OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-18
*/
public class PaymeInterfaceTest {
	/**
	 * This is the entry point for the application, it instantiates one 6-element array
	 * each element reference to one instance of subtype of programmer or invoice 
	 * print object description(toString) and paydue to console
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		// CREATE SIX-ELEMENTS Payme array HERE 
		Payme[] paymeObjects = new Payme[6];
		paymeObjects[0] = new Invoice("22776","brakes",3,300);
		paymeObjects[1] = new Invoice("33442","gear",5,90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma","Chidimma", "345-67-0001", 1, 2023, 320);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 2, 2023, 18.95, 40);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 3, 2023, 16500, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888",4, 2023, 1200, 0.04, 720);

		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

		// generically process each element in array paymeObjects
		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s", currentPayme.toString());

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to
				// BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
				
				//get base salary as the old base salary
				double oldBaseSalary = programmer.getBaseSalary();
				//increase the base salary by 0.05
				programmer.setBaseSalary(1.05 * oldBaseSalary);
				System.out.printf("new base salary with 5%% increase is: $%,.2f\n", programmer.getBaseSalary());
			}
			System.out.printf("payment due: $%.2f\n", currentPayme.getPaymentAmount());
			System.out.println();
		}
	}
}
