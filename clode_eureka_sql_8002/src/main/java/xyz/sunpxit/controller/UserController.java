package xyz.sunpxit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.sunpxit.Bean.User;
import xyz.sunpxit.dao.UserDao;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/dept/all", method = RequestMethod.GET)
    public List<User> findAll(){

        return userDao.findAll();
    }
}
