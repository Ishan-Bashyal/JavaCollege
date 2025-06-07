class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }

    public static void main(String[] args) {
        FictionBook fb = new FictionBook("Vagabond", "Takehiko Inoue");
        fb.displayDetails();

        NonFictionBook nfb = new NonFictionBook("JoJo", "Hirohiko Araki");
        nfb.displayDetails();

        TechnicalBook tb = new TechnicalBook("Berserk", "Kentaro Miura");
        tb.displayDetails();
    }
}

