package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    //처음 페이지 호출
    @GetMapping("/")
    public String home() {
        return "home";
    }

}
