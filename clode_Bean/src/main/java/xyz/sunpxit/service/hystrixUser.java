package xyz.sunpxit.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import xyz.sunpxit.Bean.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class hystrixUser  implements FallbackFactory<UserService>{



    @Override
    public UserService create(Throwable throwable) {
        List<User> list=new ArrayList<>();
        User user1=new User();
        user1.setName("错误");
        user1.setAge(500);
        user1.setId(500);
        user1.setBelongTo("APIUSER");
        list.add(user1);
        return new UserService() {


            @Override
            public List<User> findAll() {
                return list;
            }
        };
        }
}

