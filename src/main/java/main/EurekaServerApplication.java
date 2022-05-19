package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableEurekaServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//exclude = {DataSourceAutoConfiguration.class} -> DB를 사용 안한다는 의미
@PropertySource(value = { "classpath:application-server.properties" })
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
