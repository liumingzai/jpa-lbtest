package com.liub.jpa.dao;

import com.liub.jpa.entity.UsersEntity;
import com.liub.jpa.vo.UsersVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFuture;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Stream;

/**
 * JpaRepository 继承自 PagingAndSorting
 * Created by liub on 2015/10/29.
 */
public interface UsersJpaRepository extends JpaRepository<UsersEntity, Integer>
{

    @Lock (value = LockModeType.READ)
    public UsersEntity getUsersById ( Integer id );

    public UsersEntity getUsersByUsernameAndPassword ( String username, String password );

    public List<UsersEntity> findByUsernameNotLike ( String username );

    public List<UsersEntity> findByUsernameOrderByUsernameAsc ( String username );

    public Page<UsersEntity> findByUsername ( String username, Pageable pageable );

    public List<UsersEntity> findByUsername ( String username, Sort sort );

    public List<UsersEntity> findByAddress ( String address, Pageable pageable );

    public UsersEntity findFirstByOrderByUsernameAsc ();

    public UsersEntity findTopByOrderByAgeDesc ();

//    public Page<UsersEntity> queryFirst10ByLastname(String username, Pageable pageable);

    public Slice<UsersEntity> findTop3ByUsername ( String username, Pageable pageable );

    public List<UsersEntity> findFirst10ByUsername ( String username, Sort sort );

    public List<UsersEntity> findTop10ByUsername ( String username, Pageable pageable );

    /**
     * 流式查询
     * @return
     */
    @Query ("select u from UsersEntity u")
    public Stream<UsersEntity> findAllByCustomQueryAndStream ();

    public Stream<UsersEntity> readAllByUsernameNotNull ();

    @Query("select u from UsersEntity u")
    public Stream<UsersEntity> streamAllPaged ( Pageable pageable );

    /**
     * 异步
     * @param username
     * @return
     */
    @Async
    public Future<UsersEntity> findByUsername ( String username );

    @Async
    public CompletableFuture<UsersEntity> findOneByUsername ( String username );

    @Async
    public ListenableFuture<UsersEntity> findOneByAddress ( String address );




    /**
     * 通过JQL查询方式
     * @param id
     * @return
     */
    @Query("select a from UsersEntity a where a.id = ?")
    public UsersEntity getById ( Integer id );

    @Query("from UsersEntity a where a.id = :id")
    public UsersEntity findByAccountId ( @Param ("id") Long accountId );

    @Query("from UsersEntity a where a.id > :id")
    public Page<UsersEntity> findByBalanceGreaterThan ( @Param ("id") Integer id, Pageable pageable );


    /**
     * 保存
     * @param usersEntity
     * @return
     */
    public UsersEntity save ( UsersEntity usersEntity );


    @Modifying
    @Query("update UsersEntity a set a.age = ? where a.age < ?")
    public void changeAge ( int afterAge, int beforeAge );


    @Query(value = "select id, username, password, age, address from users where username=? ", nativeQuery = true)
    public Set<UsersEntity> findSql ( String name );

    @Query(value = "select new com.liub.jpa.vo.UsersVo(a.id, a.username, a.age) from UsersEntity a", nativeQuery = false)
    public Set<UsersVo> findAllUsersVo ();


    @Procedure (procedureName = "plus1inout")
    public Integer plus1inout ( Integer arg );
}
