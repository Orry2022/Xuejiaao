package example.flight.test;

import com.example.flight.entity.User;
import com.example.flight.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;

public class UserMapperTest{
    @Test //org.junit.Test
    public void test1() throws IOException{

        //测试查询所有用户
        // 1. 读取配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2. 会话工厂(用来生产会话的类)
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3.会话（就是数据库连接）
        SqlSession sqlSession = factory.openSession(true);
        // 4.得到UserMapper
        UserMapper userMapper = sqlSession.getMapper( UserMapper.class );

        List<User> userList = userMapper.selectLiST();

        for(User user:userList){
            System.out.println(user.getUsername()+" "+user.getPassword());
        }
    }
}
