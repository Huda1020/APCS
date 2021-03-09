//Huda Abdulle
package arraymethods;
import java.util.Scanner;
public class Book {

private static String  title; 
private static String  author;
private static String  genre;
private static int  pageCount;
private static int  totalBooks;
	
	
public Book (String bookTitle, String  bookAuthor, String bookGenre, int bookPageCount ) 

{
title = bookTitle ;
author = bookAuthor ;
genre = bookGenre ;
pageCount = bookPageCount ;
totalBooks = 0;
}
	

public static void addBook() {
Scanner keyboard = new Scanner(System.in);
 int again = 1;
	   while(again == 1) 
	   {
	    System.out.println("Please enter a book:");
		
	    System.out.println("Enter title of the book.");
	    title = keyboard.nextLine();
	    System.out.println("Enter author of the book.");
	    author = keyboard.nextLine();
	    System.out.println("Enter genre of the book.");
	    genre = keyboard.nextLine();
	    System.out.println("Enter # of pages in the book.");
	    pageCount = keyboard.nextInt();
	   
	    totalBooks++;
	    
		System.out.println("The database currently has " + totalBooks + " book(s). Would you like to enter another book? 1 - Yes 2 - No" );
		again = keyboard.nextInt();
		 
	    }
	   } 
	

	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getAuthor() {
		return author;
	}

	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public int getPageCount() {
		return pageCount;
	}

	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	
	public int getTotalBooks() {
		return totalBooks;
	}

	
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	
	
	
}