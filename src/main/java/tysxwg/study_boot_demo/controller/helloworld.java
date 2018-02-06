package tysxwg.study_boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by longge93 on 16/4/14.
 */

@RestController
@EnableAutoConfiguration
public class helloworld {
//    @Value("${test.msg}")
//    private String msg;
@Autowired
private Environment env;


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
//        return "Hello World~"+msg;
        return "方式二:"+env.getProperty("test.msg");
    }
}
