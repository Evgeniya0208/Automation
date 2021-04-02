package task7;

//task 7
public class Book {
    private int id = 0;
    private static int bookId = 0;
    public String bookName;
    public String bookAuthor;
    public int numberOfChapters;

    //initialization block1
    {
        id = bookId;
        bookId++;
    }

    //initialization block2
    {
        System.out.println("Hi World");
    }

    public Book(String bookName, String bookAuthor, int numberOfChapters) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.numberOfChapters = numberOfChapters;
    }

    public static void main(String[] args) {
    Book Emma = new Book("Emma", "Jane Austen", 24);
    System.out.println(Emma.bookId);
    Book Sherlock = new Book("Sherlock Holmes", "Konan Doyle", 43);
    System.out.println(Sherlock.bookId);
    }
}
