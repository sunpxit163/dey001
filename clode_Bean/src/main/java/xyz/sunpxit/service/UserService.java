package xyz.sunpxit.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.sunpxit.Bean.User;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT8001",fallbackFactory=hystrixUser.class )
public interface UserService {
    @RequestMapping(value = "/dept/all", method = RequestMethod.GET)
    public List<User> findAll();

}
