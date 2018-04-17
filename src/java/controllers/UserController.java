package controllers;

import entities.User;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String loginForm(@ModelAttribute("user") User user) {

        return "login_form";

    }

    @RequestMapping(value = "/loginwelcome", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user,
            BindingResult bindingResult,
            HttpSession session) {

        User u;

        if ((u = userService.login(user)) == null) {
            bindingResult.rejectValue("username", "login.fail", "Login failed. Please try again");
            return "login_form";
        } else {
            session.setAttribute("loggedUser", u);
            return "login_welcome";
        }
    }

}
