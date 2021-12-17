package com.library.hw18q4.entity;

import com.library.hw18q4.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Author extends BaseEntity {
    @Column
    private String name;
    @Column
    private Date birth;
    @Column
    private Date death;
    @ManyToMany
    List<Book> books;

    public Author() {
        super();
    }

    public Author(Integer id, String name, Date birth, Date death, List<Book> books) {
        super(id);
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(birth, author.birth) &&
                Objects.equals(death, author.death) && Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, birth, death, books);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", death=" + death +
                ", books=" + books +
                "} " + super.toString();
    }

    public static AuthorBuilder authorBuilder() {
        return new AuthorBuilder();
    }

    public static class AuthorBuilder {
        private Integer id;
        private String name;
        private Date birth;
        private Date death;
        private List<Book> books;

        public AuthorBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public AuthorBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AuthorBuilder setBirth(Date birth) {
            this.birth = birth;
            return this;
        }

        public AuthorBuilder setDeath(Date death) {
            this.death = death;
            return this;
        }

        public AuthorBuilder setBooks(List<Book> books) {
            this.books = books;
            return this;
        }

        public Author build() {
            return new Author(id, name, birth, death, books);
        }
    }
}
