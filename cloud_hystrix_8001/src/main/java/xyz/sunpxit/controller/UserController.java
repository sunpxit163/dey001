package xyz.sunpxit.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.sunpxit.Bean.User;
import xyz.sunpxit.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/dept/all", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public List<User> findAll(){
        return userDao.findAll();
    }

    public List<User> processHystrix_Get()
    {
        List<User> list=new ArrayList<>();
        User user1=new User();
        user1.setName("错误");
        user1.setAge(500);
        user1.setId(500);
        user1.setBelongTo("API");
        list.add(user1);
        return list;
    }
}
