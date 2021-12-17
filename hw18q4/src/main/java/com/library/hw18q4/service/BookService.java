package com.library.hw18q4.service;

import com.library.hw18q4.core.BaseService;
import com.library.hw18q4.dao.BookDao;
import com.library.hw18q4.entity.Book;

public class BookService extends BaseService<Book> {
    public BookService() {
        setBaseDao(new BookDao(getEntityManager()));
    }

    @Override
    public BookDao getBaseDao() {
        return (BookDao) super.getBaseDao();
    }
}
