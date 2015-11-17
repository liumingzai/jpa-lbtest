package com.liub.jpa.dao.impl;

import com.liub.jpa.entity.UsersEntity;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

/**
 * Created by Administrator on 2015/10/29.
 */
public class UsersSimpleJpaRepositoryImpl extends SimpleJpaRepository<UsersEntity, Integer>
{
    private EntityManager entityManager;


    public UsersSimpleJpaRepositoryImpl(Class<UsersEntity> domainClass, EntityManager em)
    {
        super(domainClass, em);

        this.entityManager = em;

    }
}
