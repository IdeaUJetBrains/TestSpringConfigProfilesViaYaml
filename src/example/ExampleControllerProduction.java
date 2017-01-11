package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Profile("production")
public class ExampleControllerProduction {

    @Autowired
    private Config config;

    @RequestMapping("ExampleControllerProduction")
    public String home( ) {

        return "Hello World!"
                + ", .getEnv() = " + config.getEnv()
                + ", .getName() = " + config.getName()
                + ", .getServers() = " + config.getServers()
                + ", .getOther() = " + config.getOther();



    }

}
