package com.liub.jpa.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

/**
 * Created by Administrator on 2015/10/30.
 */
@Entity
@Table(name = "user_work", schema = "", catalog = "test")
public class UserWorkEntity
{
    private Integer userId;
    private UsersEntity usersByUserId;
    private WorkEntity workByWorkId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserWorkEntity that = (UserWorkEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return userId != null ? userId.hashCode() : 0;
    }

  /*  @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UsersEntity getUsersByUserId()
    {
        return usersByUserId;
    }

    public void setUsersByUserId(UsersEntity usersByUserId)
    {
        this.usersByUserId = usersByUserId;
    }

    @Fetch(value = FetchMode.JOIN)
    @ManyToOne
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    public WorkEntity getWorkByWorkId()
    {
        return workByWorkId;
    }

    public void setWorkByWorkId(WorkEntity workByWorkId)
    {
        this.workByWorkId = workByWorkId;
    }*/
}
