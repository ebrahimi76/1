package com.library.hw18q4.dao;

import com.library.hw18q4.core.BaseDao;
import com.library.hw18q4.entity.Book;

import javax.persistence.EntityManager;

public class BookDao extends BaseDao<Book> {
    public BookDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Book> getEntityClass() {
        return Book.class;
    }
}
