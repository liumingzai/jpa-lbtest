package com.liub.jpa.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Rayn on 2015/10/30.
 */
@Entity
@Table(name = "work" )
public class WorkEntity
{
    private Integer id;
    private String workname;
    private Timestamp createDate;
    private Timestamp lastModifyDate;
    private Collection<UserWorkEntity> userWorksById;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "workname")
    public String getWorkname()
    {
        return workname;
    }

    public void setWorkname(String workname)
    {
        this.workname = workname;
    }

    @CreatedDate
    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate)
    {
        this.createDate = createDate;
    }

    @LastModifiedDate
    @Basic
    @Column(name = "last_modify_date")
    public Timestamp getLastModifyDate()
    {
        return lastModifyDate;
    }

    public void setLastModifyDate(Timestamp lastModifyDate)
    {
        this.lastModifyDate = lastModifyDate;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkEntity that = (WorkEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (workname != null ? !workname.equals(that.workname) : that.workname != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(that.lastModifyDate) : that.lastModifyDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (workname != null ? workname.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        return result;
    }

  /*  @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "workByWorkId")
    public Collection<UserWorkEntity> getUserWorksById()
    {
        return userWorksById;
    }

    public void setUserWorksById(Collection<UserWorkEntity> userWorksById)
    {
        this.userWorksById = userWorksById;
    }*/
}
