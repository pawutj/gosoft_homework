package lab1spring.lab1spring;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqParamController {
    @GetMapping(path = "/test2")
    @ResponseBody
    String getTest(@RequestParam("id") String id) {
        return id;
    }
}
