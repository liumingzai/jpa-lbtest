package com.liub.jpa.dao;

import com.liub.jpa.entity.UserWorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rayn on 2015/10/30.
 */
public interface UsersWorkJpaRepository extends JpaRepository<UserWorkEntity, Integer>
{

}
