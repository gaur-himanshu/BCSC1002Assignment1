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
	private int issuedBooks;
	private String[] book;
	
	// constructor() method without parameter.
	
	public Student() {
		firstName = " ";
		middleName = " ";
		lastName = " ";
		universityRollNumber = 000000L;
		issuedBooks = 0;
		book[0] = " ";
	}
	
	// constructor() method with parameters.

	public Student(String firstName, String middleName, String lastName, int universityRollNumber, int bookIssued, String[] book) {
	
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.universityRollNumber = universityRollNumber;
		this.issuedBooks = issuedBooks;
		this.book = book;
	}
	
	
    

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

	public void setIssuedBooks(int issuedBooks) {
	
		this.issuedBooks = issuedBooks;
	}

	public int getIssuedBooks() {
	
		return issuedBooks;
	}

	public void setBook(String[] book) {
	
		this.book = book;
	}

	public String[] getBook() {
	
		return book;
    }
}
