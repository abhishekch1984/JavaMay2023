import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book bArray []= new book[7];
		bArray[0] = new book(123, "Book1","Auth1",12);
		bArray[1] = new book(123, "Book2","Auth2",12);
		bArray[2] = new book(123, "Book3","Auth3",12);
		bArray[3] = new book(123, "Book4","Auth4",12);
		bArray[4] = new book(123, "Book5","Auth5",12);
		bArray[5] = new book(123, "Book5","Auth5",12);
		bArray[6] = new book(123, "Book6","Auth6",12);
		System.out.println("First type of Array starts here---------------------");
		for (int i = 0; i < bArray.length; i++) {
			System.out.println("book : "+bArray[i]);
		}
		
		System.out.println("Second type of Array starts here---------------------");
		
		book book1 = new book(101,"Java 11","James Gosling",1200);
		book book2 = new book(102,"Oracle 21","Scott M",1100);
		book book3 = new book(103,"Linux","Richard Stallman",1500);
		book book4 = new book(104,"Data Structure","ABC",1800);
		book book5 = new book(105,"Operating Systems","CDE",2000);
		
		ArrayList<book> bookList = new ArrayList<book>(); 	
		
		bookList.add(book1);
		System.out.println("Added the 1stbook");
		bookList.add(book2);
		System.out.println("Added the 2nd book");
		bookList.add(book3);
		System.out.println("Added the 3rd book");
		bookList.add(book4);
		System.out.println("Added the 4th book");
		bookList.add(book5);
		System.out.println("Added the 5th book");
		
		Iterator<book> iterator = bookList.iterator(); //STRAW
		System.out.println("Got the Iterator.....");
		
		while(iterator.hasNext()) {
			book b = iterator.next();
			System.out.println("Book is : "+b);
		}
		
		
		
		ArrayList<PhoneLog> logList = new ArrayList<PhoneLog>(); //10 20 40 80 160
		System.out.println("Container created....");

		PhoneLog log1 = new PhoneLog("9820443464", "dialied", "12-May-2023 12:30");
		PhoneLog log2 = new PhoneLog("8820443474", "missed", "14-May-2023 13:30");
		PhoneLog log3 = new PhoneLog("9820443444", "dialed", "15-May-2023 15:30");
		
		logList.add(log1);//CONTENT is ADDED to the CONTAINER
		System.out.println("Added the 1st log");
		logList.add(log2);
		System.out.println("Added the 2nd log");
		logList.add(log3);
		System.out.println("Added the 3rd log");
		
		Iterator<PhoneLog> iterator1 = logList.iterator(); //STRAW
		System.out.println("Got the Iterator.....");
		
		while(iterator1.hasNext()) { //lower and upper bound
			PhoneLog log = iterator1.next();
			System.out.println("Log is : "+log);
		}
		
		
	}

}
class book
{
	int bookId;
	String bookName;
	String authorName;
	int bookCost;
	/**
	 * @param bookId
	 * @param bookName
	 * @param authorName
	 * @param bookCost
	 */
	public book(int bookId, String bookName, String authorName, int bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookCost="
				+ bookCost + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	
}
class PhoneLog
{
	String logNumber; //
	String logType; //missed,recieved,dialled
	String dateAndTime;
	public PhoneLog(String logNumber, String logType, String dateAndTime) {
		super();
		this.logNumber = logNumber;
		this.logType = logType;
		this.dateAndTime = dateAndTime;
	}
	@Override
	public String toString() {
		return "PhoneLog [logNumber=" + logNumber + ", logType=" + logType + ", dateAndTime=" + dateAndTime + "]";
	}
	
	
}