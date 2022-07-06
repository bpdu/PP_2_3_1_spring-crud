package spring_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring_crud.model.User;
import spring_crud.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/")
    public String printUsers(Model model) {
        model.addAttribute(userService.getUserList());
        return("user");
    }

    @DeleteMapping
    public


}
