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
	
	public Library(Book[] availableBooks) {
	
		this.availableBooks = availableBooks;
	}
	
	// this method add a new Book to our Library.
	
	public void addBook(String name) {
        System.out.println(name + " is now added to the Library.");
    }

	public void setAvailableBooks(Book[] availableBooks) {
	
		this.availableBooks = availableBooks;
	}

	public Book[] getAvailableBooks() {
	
		return availableBooks.clone();
	}
	
	// the toString method
	
    @Override
    public String toString() {
        return Arrays.toString(availableBooks);
    }
	
	// the equals and hashcode method
	

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library that = (Library) o;
        return Arrays.equals(getAvailableBooks(), that.getAvailableBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }
}
