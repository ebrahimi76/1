package com.library.hw18q4.dao;

import com.library.hw18q4.core.BaseDao;
import com.library.hw18q4.entity.Author;

import javax.persistence.EntityManager;

public class AuthorDao extends BaseDao<Author> {
    public AuthorDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Author> getEntityClass() {
        return Author.class;
    }
}
