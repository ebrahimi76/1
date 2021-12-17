package com.library.hw18q4.service;

import com.library.hw18q4.core.BaseService;
import com.library.hw18q4.dao.AuthorDao;
import com.library.hw18q4.entity.Author;

public class AuthorService extends BaseService<Author> {
    public AuthorService() {
        setBaseDao(new AuthorDao(getEntityManager()));
    }

    @Override
    public AuthorDao getBaseDao() {
        return (AuthorDao) super.getBaseDao();
    }
}
