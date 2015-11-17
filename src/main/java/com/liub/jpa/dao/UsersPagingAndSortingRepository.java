package com.liub.jpa.dao;

import com.liub.jpa.entity.UsersEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 分页 和 排序   PagingAndSortingRepository 继承自 CrudRepository
 * Created by Rayn on 2015/10/29.
 */
public interface UsersPagingAndSortingRepository extends PagingAndSortingRepository<UsersEntity, Integer>
{
}
