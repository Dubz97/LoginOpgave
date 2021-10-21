package com.example.loginopgave.Controllers;


import com.example.loginopgave.LoginOpgaveApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


@GetMapping("/")
  public String login() {
  return "login";
}

@GetMapping("/signup")
  public String signup()  {
  return "registration";
}

@GetMapping("/complete")
  public String complete()  {
  return "index";
}




}
