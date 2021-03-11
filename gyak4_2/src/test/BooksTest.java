package test;

import gyak4_2.Books;

public class BooksTest {

	public static void main(String[] args) {
		
		Books book = new Books();
		book.setTitle("Nemesis");
		book.setAuthor("Isaac Asimov");
		book.setRelease_year(1989);
		book.setPrice(1500);
		System.out.println(book.displayInfo());

	}

}
