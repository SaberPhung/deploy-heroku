package fi.vamk.e1800920.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/test")
    public String test(){
        return "{\"id\":1}";
    }
}
