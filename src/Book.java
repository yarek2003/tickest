public class Book {
    String tittle;
    String author;

    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
