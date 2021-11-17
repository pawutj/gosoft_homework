package lab1spring.lab1spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "<div><h1>test</h1></div>";
    }
}