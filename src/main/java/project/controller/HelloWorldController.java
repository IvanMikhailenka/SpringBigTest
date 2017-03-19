package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.dao.service.UserService;
import project.dao.service.UserServiceImpl;

@Controller
@RequestMapping("/")
public class HelloWorldController {

  //TODO: hardcode class, for check that hibernate is work. Delete this shit
  @Autowired
  private UserService userService;

  @RequestMapping(method = RequestMethod.GET)
  public String sayHello(ModelMap model) {
    model.addAttribute("greeting", "Hello World from Spring 4 MVC");
    //TODO: delete this shit
    System.out.println(userService.findAllUsers());
    return "welcome";
  }

  @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
  public String sayHelloAgain(ModelMap model) {
    model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
    return "welcome";
  }

}