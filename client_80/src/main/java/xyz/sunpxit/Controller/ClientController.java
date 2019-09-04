package xyz.sunpxit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.sunpxit.Bean.User;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT8001";

    @GetMapping(value = "/consumer/dept/all")
    public List<User> add() throws Exception {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/all", List.class);
    }
}
