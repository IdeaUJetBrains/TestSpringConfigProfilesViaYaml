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
@SpringBootApplication (exclude={DataSourceAutoConfiguration.class})
public class ExampleController {

    @Autowired
    private Config config;

    @RequestMapping("ExampleController")
    public String home( ) {

        return "Hello World!"
                + ", .getEnv() = " + config.getEnv()
                + ", .getName() = " + config.getName()
                + ", .getServers() = " + config.getServers()
                + ", .getOther() = " + config.getOther();



    }
    public static void main(String[] args) throws Exception {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "production");
        SpringApplication.run(ExampleController.class, args);

    }
}
