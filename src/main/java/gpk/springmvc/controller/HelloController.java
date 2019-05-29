package gpk.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    String hello(ModelMap model) {
        model.addAttribute("message", "Hello from @Controller with ModelMap!");
        return "hello";
    }
}
