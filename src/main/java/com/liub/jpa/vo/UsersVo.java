package com.liub.jpa.vo;

/**
 * Created by Rayn on 2015/10/29.
 */
public class UsersVo
{
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String address;

    public UsersVo()
    {
    }

    public UsersVo(Integer id, String username, Integer age)
    {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public UsersVo(Integer id, String username, String password, Integer age, String address)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
