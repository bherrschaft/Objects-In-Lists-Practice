public class Book {
    private String title;
    private int numPages;
    private int pubYear;

    public Book(String title, int numPages, int pubYear) {
        this.title = title;
        this.numPages = numPages;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return "The book '" + title + "' has " + numPages + " pages and was published in " + pubYear + ".";
    }
}
