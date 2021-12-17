package com.library.hw18q4.entity;

import com.library.hw18q4.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Book extends BaseEntity {
    @Column
    private String title;
    @Column
    private Integer price;
    @Column
    private Long isbn;
    @Column
    private Genre genre;
    @Column
    private Language language;
    @ManyToMany
    List<Author> authors;

    public Book() {
        super();
    }

    public Book(Integer id, String title, Integer price, Long isbn, Genre genre, Language language,
                List<Author> authors) {
        super(id);
        this.title = title;
        this.price = price;
        this.isbn = isbn;
        this.genre = genre;
        this.language = language;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(price, book.price) &&
                Objects.equals(isbn, book.isbn) && genre == book.genre && language == book.language &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, price, isbn, genre, language, authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", isbn=" + isbn +
                ", genre=" + genre +
                ", language=" + language +
                ", authors=" + authors +
                "} " + super.toString();
    }

    public static BookBuilder bookBuilder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
        private Integer id;
        private String title;
        private Integer price;
        private Long isbn;
        private Genre genre;
        private Language language;
        private List<Author> authors;

        public BookBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public BookBuilder setIsbn(Long isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setLanguage(Language language) {
            this.language = language;
            return this;
        }

        public BookBuilder setAuthors(List<Author> authors) {
            this.authors = authors;
            return this;
        }

        public Book build() {
            return new Book(id, title, price, isbn, genre, language, authors);
        }
    }
}
