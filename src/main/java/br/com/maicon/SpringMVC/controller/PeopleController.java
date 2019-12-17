package br.com.maicon.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {

    @GetMapping("/")
    public String getAllPeople(Model model) {
        String people = "Maicon douglas";
        model.addAttribute("mensagem", people);
        return "index";
    }

}
