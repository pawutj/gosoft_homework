package authen.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewPageController {
    @GetMapping("/test")
    public String viewtest() {
        return "HELLO WORLD";
    }
}
