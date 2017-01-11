package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Profile("developer")
public class ExampleControllerDeveloper {

    @Autowired
    private Config config;

    @RequestMapping("ExampleControllerDeveloper")
    public String home( ) {

        return "Hello World!"
                + ", .getEnv() = " + config.getEnv()
                + ", .getName() = " + config.getName()
                + ", .getServers() = " + config.getServers()
                + ", .getOther() = " + config.getOther();



    }

}
