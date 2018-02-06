package tysxwg.study_boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class helloworld {
    @Autowired
    private Environment env;


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "hello world:"+env.getProperty("test.msg");
    }
}
