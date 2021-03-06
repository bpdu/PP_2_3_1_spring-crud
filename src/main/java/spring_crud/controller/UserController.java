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

    @GetMapping(value="users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getUserList());
        return("users");
    }

    @GetMapping(value="create")
    public String createUserRedirect(User user) {
        return "create";
    }

    @PostMapping(value="create")
    public String createUser(User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return("redirect:/users");
    }

    @GetMapping(value="update/{id}")
    public String updateUserRedirect(@PathVariable("id") long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "update";
    }

    @PostMapping(value="update")
    public String updateUser(User user) {
        userService.updateUser(user.getId(), user.getName(), user.getEmail(), user.getAge());
        return "redirect:/users";
    }


}
