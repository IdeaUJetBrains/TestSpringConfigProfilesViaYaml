package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Profile("testing")
public class ExampleControllerTesting {

    @Autowired
    private Config config;

    @RequestMapping("ExampleControllerTesting")
    public String home( ) {

        return "Hello World!"
                + ", .getEnv() = " + config.getEnv()
                + ", .getName() = " + config.getName()
                + ", .getServers() = " + config.getServers()
                + ", .getOther() = " + config.getOther();



    }
}
