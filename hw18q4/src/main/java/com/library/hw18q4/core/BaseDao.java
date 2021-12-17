package com.library.hw18q4.core;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseDao<T extends BaseEntity> {
    private final EntityManager entityManager;

    public BaseDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(Integer id, T newEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(newEntity);
        entityManager.getTransaction().commit();
    }

    public void delete(Integer id) {
        entityManager.getTransaction().begin();
        T entity = loadById(id);
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public T loadById(Integer id) {
        return entityManager.find(getEntityClass(), id);
    }

    public List<T> loadAll() {
        return entityManager.createQuery("From " + getEntityClass().getSimpleName()).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public abstract Class<T> getEntityClass();
}
