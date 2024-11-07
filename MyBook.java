import java.util.Scanner;
class Book
{
	String name;
	String author;
	double price;
	int numPages;
	Book(){}
	Book(String name,String author,double price,int numPages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
	}
	void details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the book:");
		name = sc.nextLine();
		System.out.println("Enter name of the author:");
		author = sc.nextLine();
		System.out.println("Enter price:");
		price = sc.nextDouble();
		System.out.println("Enter number of pages:");
		numPages = sc.nextInt();
		sc.nextLine();
	}
	void display()
	{
		System.out.println("Name of the book: "+name);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
		System.out.println("Number of pages of the book: "+numPages);
	}
	public String toString()
	{
		return "Book name: "+name+"\n"+"Author name: "+author+"\n"+"Number of pages: "+numPages+"\n"+"Price of the book: "+price;
	}

}
class MyBook
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books:");
		int n = sc.nextInt();
		Book[] books = new Book[n];
		for(int i=0;i<n;i++)
		{
			books[i]=new Book();
			books[i].details();
		}
		System.out.println("\nBook details:");
		for(Book book:books)
		{	System.out.println(book); }
	}
}




		