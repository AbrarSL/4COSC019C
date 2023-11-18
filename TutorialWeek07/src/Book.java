public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int publishedYear;
    private String author;

    public Book(String title, int publishedYear, String author) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Title=%s, Price=%.2f, Published=%d, Author=%s", title, price, publishedYear, author);
    }

    @Override
    public int compareTo(Book other) {
        return this.getPublishedYear() - other.getPublishedYear();
    }
}
