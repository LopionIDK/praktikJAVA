package Pr1;

public class Book {
    private String name, author, publisher;
    private int edition, publishYear;

    /* Конструктор класса Book с параметрами name, author, publisher, edition, publishYear */
    public Book(String name, String author, String publisher, int edition, int publishYear) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        setEdition(edition);
    }

    /* Конструктор класса Book с параметрами name и author */
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        setEdition(0);
    }

    /* Конструктор класса Book без параметров */
    public Book() {
        this.name = "default";
        this.author = "default";
        setEdition(0);
    }

    /* Переопределенный метод toString() - возвращает строковое представление объекта класса Book */
    public String toString() {
        String res = "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'';
        if(edition > 0)
            res += ", publisher='" + publisher + '\'' +
                    ", edition=" + edition  +
                    ", publishYear=" + publishYear+
                    '}';
        else res += ", had not been published yet!}";
        return res;
    }

    public String getName() {
        return name;
    }

    /* Сеттер для поля name - устанавливает название книги */
    public void setName(String name) {
        this.name = name;
    }

    /* Геттер для поля author - возвращает автора книги */
    public String getAuthor() {
        return author;
    }

    /* Сеттер для поля author - устанавливает автора книги */
    public void setAuthor(String author) {
        this.author = author;
    }

    /* Геттер для поля publisher - возвращает издателя книги */
    public String getPublisher() {
        return edition > 0 ? publisher:"None";
    }

    /* Сеттер для поля publisher - устанавливает издателя книги */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /* Геттер для поля edition - возвращает тираж книги */
    public int getEdition() {
        return edition;
    }

    /* Сеттер для поля publishYear - устанавливает год издания книги */
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    /* Геттер для поля publishYear - возвращает год издания книги */
    public int getPublishYear() {
        return edition > 0 ? publishYear : -1;
    }

    /* Сеттер для поля edition - устанавливает тираж книги */
    public void setEdition(int edition) {
        if(edition < 0) throw new IllegalArgumentException("Тираж не может быть меньше 0!");
        this.edition = edition;
    }
}



