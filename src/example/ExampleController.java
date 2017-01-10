package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MissingRequiredPropertiesException;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


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
        SpringApplication.run(ExampleController.class, args);
    }
}
