package lab1spring.lab1spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController

public class ResponseEntityController {
    @RequestMapping(value = "/test3")
    public ResponseEntity<String> test3() {
        return new ResponseEntity<String>("true", HttpStatus.OK);
    }
}
