package com.liub.jpa.dao;

import com.liub.jpa.entity.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rayn on 2015/10/30.
 */
public interface WorkJpaRepository extends JpaRepository<WorkEntity, Integer>
{
}
