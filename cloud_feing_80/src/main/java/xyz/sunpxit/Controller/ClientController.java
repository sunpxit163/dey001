package xyz.sunpxit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.sunpxit.Bean.User;
import xyz.sunpxit.service.UserService;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private UserService userService ;
    @GetMapping(value = "/consumer/dept/all")
    public List<User> add() throws Exception {
        return userService.findAll();
    }
}
