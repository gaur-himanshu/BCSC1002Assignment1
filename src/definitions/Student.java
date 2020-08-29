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
	private Book[] issuedBooksName;
	
	// constructor() method without parameter.
	
	public Student() {
		firstName = " ";
		middleName = " ";
		lastName = " ";
		universityRollNumber = 000000L;
		issuedBooks = 0;
		this.issuedBooksName= new Book[6];
        for (int i = 0; i < issuedBooks; i++) {
            issuedBooksName[i] = new Book("Book " + (i + 1));
        }
    }
	
	// constructor() method with parameters.

	public Student(String firstName, String middleName, String lastName, int universityRollNumber, int bookIssued, Boom[] issuedBooksName) {
	
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.universityRollNumber = universityRollNumber;
		this.issuedBooks = issuedBooks;
		this.issuedBooksName = issuedBooksName;
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

	public void setIssuedBooksName(Book[] issuedBooksName) {
	
		this.issuedBooksName= issuedBooksName;
	}

	public Book[] getIssuedBooksName() {
	
		return issuedBookName.clone();
    }
	
	// the equals method 

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStore that = (VideoStore) o;
        return this.getFirstName().equals(getFirstName()) && this.getMiddleName().equals(getMiddleName()) && this.getLastName().equals(getLastName()) && this.getUniversityRollNumber() == getUniversityRollNumber() && this.getIssuedBooks() == getIssuedBooks && Arrays.equals(getIssuedBooksName(), that.getIssuedBooksName());
    }
}
