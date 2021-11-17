package lab1spring.lab1spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PathVarController {
    @GetMapping(path = "test/{test}")
    @ResponseBody
    String getTest(@PathVariable("test") String t) {
        return t;
    }
}
