/*  User: Himanshu Gaur
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private long int universityRollNumber;
	private int bookIssued;
	private String[] book;
	
	


	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
	}

	public String getFirstName() {
	
		return firstName;
	}

	public void setMiddleName(String middleName) {
	
		this.middleName = middleName;
	}

	public String getMiddleName() {
	
		return middleName;
	}

	public void setLastName(String lastName) {
	
		this.lastName = lastName;
	}

	public String getLastName() {
	
		return lastName;
	}

	public void setUniversityRollNumber(int universityRollNumber) {
	
		this.universityRollNumber = universityRollNumber;
	}

	public int getUniversityRollNumber() {
	
		return universityRollNumber;
	}

	public void setBookIssued(int bookIssued) {
	
		this.bookIssued = bookIssued;
	}

	public int getBookIssued() {
	
		return bookIssued;
	}

	public void setBook(String[] book) {
	
		this.book = book;
	}

	public String[] getBook() {
	
		return book;
    }
}
