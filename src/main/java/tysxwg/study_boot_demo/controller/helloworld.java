package tysxwg.study_boot_demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by longge93 on 16/4/14.
 */

@RestController
@EnableAutoConfiguration
public class helloworld {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "Hello World~";
    }
}
