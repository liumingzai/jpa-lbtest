package com.liub.jpa.service.impl;

import com.liub.jpa.dao.UsersJpaRepository;
import com.liub.jpa.entity.UsersEntity;
import com.liub.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Rayn on 2015/10/29.
 */
@Service
@Transactional(value = "jpaTransactionManager")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UsersJpaRepository usersJpaRepository;

    public void createNewAccount(String username, String password, Integer age, String address)
    {
        UsersEntity users = new UsersEntity();
        users.setUsername("liub");
        users.setPassword("123456");
        users.setAge(25);
        users.setAddress("北京");

        UsersEntity usersEntity = usersJpaRepository.save(users);
        System.out.println(usersEntity.getAddress());
    }


}
