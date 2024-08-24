package mySelf.configServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ServiceConfiguration serviceConfiguration;

    @GetMapping("/values")
    public String getAllValues() {
        return serviceConfiguration.getHost() + serviceConfiguration.getHost() + serviceConfiguration.getUsername() + serviceConfiguration.getPassword();
    }

}
