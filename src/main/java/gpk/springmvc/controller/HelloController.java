package gpk.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    private final String myBean;

    @Autowired
    public HelloController(@Qualifier("MyBean") String myBean) {
        this.myBean = myBean;
    }

    @GetMapping("/hello")
    String hello(ModelMap model) {
        model.addAttribute("message", "Hello from @Controller with ModelMap!");
        model.addAttribute("my_bean", myBean);
        return "hello";
    }
}
