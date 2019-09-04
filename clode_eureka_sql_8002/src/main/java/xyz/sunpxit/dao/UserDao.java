package xyz.sunpxit.dao;

import org.springframework.stereotype.Service;
import xyz.sunpxit.Bean.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserDao {
    public List<User> findAll(){
        List<User> list=new ArrayList<>();

        User user1=new User();


        user1.setName("张三");
        user1.setAge(24);
        user1.setId(1);
        user1.setBelongTo("sql_8002");
        list.add(user1);

        return list;

    }
}
