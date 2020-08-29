/*  User: Himanshu Gaur
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

	private Book[] availableBooks;
	
	// the constructor() method without parameter.
	
	public Library() {
        this.availableBook = new Book[10000];
        for (int i = 0; i < availableBook.length; i++) {
            availableBook[i] = new Book("Book " + (i + 1));
        }
    }

	// the constructor() method with parameter.
	
	public Library(Book[] availableBooks)
	{
		this.availableBooks = availableBooks;
	}
	
	// the toString method
	
    @Override
    public String toString() {
        return Arrays.toString(availableBooks);
    }
}
