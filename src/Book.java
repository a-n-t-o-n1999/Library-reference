import java.util.Objects;

public class Book {
    String name;
    Author authorBook;
    int yearСreation;

    public Book(String name, Author authorBook, int yearСreation) {
        this.name = name;
        this.authorBook = authorBook;
        this.yearСreation = yearСreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(Author authorBook) {
        this.authorBook = authorBook;
    }

    public int getYearСreation() {
        return yearСreation;
    }

    public void setyearСreation(int yearСreation) {
        this.yearСreation = yearСreation;
    }

    public String toString() {
        return "Название " + name + " Автор " + authorBook + " Год написания " + yearСreation;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name,book.name)&&Objects.equals(authorBook,book.authorBook)&&Objects.equals(yearСreation,book.yearСreation);
    }
    public int hashCode() {return Objects.hash(name,authorBook,yearСreation); }

}