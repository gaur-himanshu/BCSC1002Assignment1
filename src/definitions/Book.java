/*  User: Himanshu Gaur 
 *  Date: 26/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private String iSBNNumber;

	// constructer() method without parameter.

	public Book() {
		bookName = " ";
		bookAuthor = " ";
		iSBNNumber = "0000000000000";
	}

	// Costructer() method with parameter.

	public Book(String bookName, String bookAuthor, String iSBNNumber) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		if (iSBNNumber.length() == 13) {
			this.iSBNNumber = iSBNNumber;
		}
		else {
			System.out.println("please enter 13 digit number");
		}
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setISBNNumber(String iSBNNumber) {
		if (iSBNNumber.length() == 13) {
			this.iSBNNumber = iSBNNumber;
		}
		else {
			System.out.println("Please enter the correct ISBN number,it should be of 13 digit");
		}
	}

	public String getISBNNumber() {
		return iSBNNumber;
	}
	// this tostring() method converts the object to string.
	
	public String toString() {
        return String.format("Book Name: %s, Book Author: %s, ISBN Number: %s", getBookName(), getBookAuthor(), getISBNNumber());
	}
	
	// the equals() and the hashcode() methods.
	
    @Override
    public boolean equals(Object o) {
        if (this == o) { 
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return this.getBookName().equals(Book.getBookName()) && this.getBookAuthor().equals(getBookAuthor)) && this.getISBNNumber().equals(getISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getISBNNumber());
    }
}
