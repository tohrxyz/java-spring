package xyz.tohrxyz.java.spring.spring_edu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
  
  @GetMapping("/")
  public String home() {
    return "index";
  }
}
