package com.liub.jpa.dao;

import com.liub.jpa.entity.UsersEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * JpaRepository 继承自 PagingAndSorting
 * Created by Rayn on 2015/10/29.
 */
public interface UsersJpaRepository2 extends JpaRepository<UsersEntity2, Integer>
{
    @Async
    Future<UsersEntity2> findByUsername ( String username );

    @Async
    CompletableFuture<UsersEntity2> findOneById ( String id );

    @Async
    ListenableFuture<UsersEntity2> findOneByUsername ( String username );
}
