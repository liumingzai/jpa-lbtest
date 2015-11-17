# Druid 加密方式
java -cp druid-0.2.9.jar com.alibaba.druid.filter.config.ConfigTools you_password 即输出加密后密码

<!-- sql统计功能就不能用 <property name="filters" value="stat" /> -->
<property name="filters" value="config" />
<property name="connectionProperties" value="config.decrypt=true" />


# Spring-data-jpa 文档地址
http://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#specifications