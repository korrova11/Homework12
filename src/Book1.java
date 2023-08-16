public class Book1 {
    private String titleBook;
    private Author author;
    private int yearPublication;




    Book1(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {

        return titleBook;
    }

    public Author getAuthor() {
        return author;

    }

    public int getYearPublication() {

        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {

        this.yearPublication = yearPublication;
    }
}

