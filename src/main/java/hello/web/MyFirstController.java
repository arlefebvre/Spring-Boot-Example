package hello.web;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arthur on 08/12/2015.
 */
@RestController
public class MyFirstController {
    //@Secured("ROLE_CHEF")
    @RequestMapping("/")
    public String hello(){
        return "Bonjour la communauté";
    }
}
