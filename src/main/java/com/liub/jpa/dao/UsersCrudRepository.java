package com.liub.jpa.dao;


import com.liub.jpa.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lb on 2015/11/17.
 */
public interface UsersCrudRepository extends CrudRepository<UsersEntity, Integer>
{




}
