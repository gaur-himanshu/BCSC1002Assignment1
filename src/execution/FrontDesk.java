/* User: Himanshu Gaur
 *  Date: 30/08/20
 *  Time: 7:31 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
	
	private static final int ISSUE_A_NEW_BOOK = 1;
	private static final int RETURN_THE_PREVIOUS_BOOK = 2;
	private static final int SHOW_ALL_ISSUED_BOOKS = 3;
	private static final int EXIT = 4;
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String bookName;
	    int studentInput;
	    Student student = new Student();
	    do {
		    System.out.println("Enter your first name")
		    student.setFirstName(scanner.nextLine());
			System.out.println("Enter your middle name");
			student.setMiddleName(scanner.nextLine());
			System.out.println("Enter your last name");
			student.setLastName(scanner.nextLine());
			System.out.println("Enter your University roll number");
			student.setUniversityRollNumber(scanner.nextLong);
			System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
		    System.out.println("How may I help you today?");
		    System.out.println("1. Issue a new book for me.");
		    System.out.println("2. Return a previously issues book for me.");
		    System.out.println("3. Show me all my issues books.");
		    System.out.println("4. Exit.");
		    System.out.println("Please choose from 1 to 4 as per your requirement");
		    studentInput = scanner.nextInt();
		    switch (studentInput) {
			    case ISSUE_A_NEW_BOOK:
					System.out.println("Please! Enter the book name do you want to issue");
					student.addBook(scanner.nextLine());
					break;
		        case RETURN_THE_PREVIOUS_BOOK:
		            System.out.println("Enter the name of book do you want to return")
		            sudent.returnBook(scanner.nextLine());
		            break;
				case SHOW_ALL_ISSUED_BOOKS:
					System.out.println("The name of all books which is/are issued.")
					System.out.println(student.getIssuedBooksName);
					break;
				default:
				    break;
		    }
		}
		while (studentInput != EXIT);
		scanner.close();
    }
}
 
