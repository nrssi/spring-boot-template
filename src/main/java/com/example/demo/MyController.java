package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController{
  @RequestMapping("/welcome")
  public String welcome(){
    return "welcome.jsp";
  }
}
