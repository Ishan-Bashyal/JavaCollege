public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable = true;

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPublicationYear(int y) {
        publicationYear = y;
    }

    public void borrowBook() {
        if (isAvailable) isAvailable = false;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

