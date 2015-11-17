package liu.test;

import com.liub.jpa.dao.UsersJpaRepository;
import com.liub.jpa.entity.UsersEntity;
import com.liub.jpa.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liubing on 2015/11/17.
 */
public class UserJpaTest extends SpringTest
{

    @Autowired
    UserService userService;

    @Autowired
    UsersJpaRepository usersJpaRepository;

    @Test
    public void addUser(){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername( "jingjing" );
        usersEntity.setAge( 18 );
        usersEntity.setAddress( "成都熊猫基地" );
        usersEntity.setPassword( "666666" );
        UsersEntity save = this.usersJpaRepository.save( usersEntity );
        System.out.println(save);
    }
}
