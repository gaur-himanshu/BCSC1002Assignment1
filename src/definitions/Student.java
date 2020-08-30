/*  User: Himanshu Gaur
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
	private String firstName;
	private String middleName;
	private String lastName;
	private long universityRollNumber;
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

	public Student(String firstName, String middleName, String lastName, long universityRollNumber, int bookIssued, Book[] issuedBooksName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.universityRollNumber = universityRollNumber;
		this.issuedBooks = issuedBooks;
		this.issuedBooksName = issuedBooksName;
	}
	
    // this method will show the book name which is issued to Student.
	
	public void addBook(String name) {
        System.out.println(name + " is issued to the Student.");
    }
	
	// this method will shkw the returned book.
	
	public void returnBook(String name) {
		System.out.println(name + "book is returned");
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

	public void setUniversityRollNumber(long universityRollNumber) {
		this.universityRollNumber = universityRollNumber;
	}

	public long getUniversityRollNumber() {
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
	
	// the toString method
	
	@override
    public String toString() {
        return "Student{" +
			"firstName = " + firstName + 
			", middleName = " + middleName + 
			", lastName = " + lastName + 
			", universityRollNumber = " + universityRollNumber +
			", issuedBooks = " + numberOfBooksIssued +
			", issuedBooksName = " + Arrays.toString(issuedBooksName) +
			'}';
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
	
	// the hashcode methode
	
	@Override
    public int hashCode() {
        int[] result = {Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getIssuedBooks()), Array.hashcode(getIssuedBooksName())};
        return result;
    }
}
