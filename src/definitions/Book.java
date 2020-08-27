/*  User: Himanshu Gaur 
 *  Date: 26/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book
{

	private String bookName;
	private String bookAuthor;
	private String iSBNNumber;




	public void setBookName(String bookName)
	{

		this.bookName = bookName;
	}

	public String getBookName()
	{

		return bookName;
	}

	public void setBookAuthor(String bookAuthor)
	{

		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor()
	{

		return bookAuthor;
	}

	public void setISBNNumber(String iSBNNumber)
	{

		if (iSBNNumber.length() == 13)
		{
			this.iSBNNumber = iSBNNumber;
		}
		else
		{
			System.out.println("Please enter the correct ISBN number,it should be of 13 digit");

		}


	}

	public String getISBNNumber()
	{

		return iSBNNumber;
	}
}
