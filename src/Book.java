public class Book {
    private String titleBook;
    private String author;
    private int yearPublication;


      Book(String titleBook, String author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {

          return titleBook;
    }

    public String getAuthor() {
        return author;

    }

    public int getYearPublication() {

         return yearPublication;
    }

    public void setYearPublication(int yearPublication) {

        this.yearPublication = yearPublication;
    }
}
