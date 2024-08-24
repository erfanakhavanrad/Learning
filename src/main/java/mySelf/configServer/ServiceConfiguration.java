package mySelf.configServer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "applicationconfigutation")
@Configuration
@Data
public class ServiceConfiguration {
    private String host;
    private int port;
    private String username;
    private String password;

//    public String getHost(){
//        return host;
//    }

}
