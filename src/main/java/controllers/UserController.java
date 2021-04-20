package controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Congratulation");
        messages.add("It finally works");
        model.addAttribute("messages", messages);
        return "indexes";
    }

}
