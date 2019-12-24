package br.com.maicon.SpringMVC.controller;

import br.com.maicon.SpringMVC.controller.service.PeopleService;
import br.com.maicon.SpringMVC.controller.service.exceptions.GenericExpection;
import br.com.maicon.SpringMVC.model.People;
import br.com.maicon.SpringMVC.repository.PeopleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/")
    public String getAllPeople(Model model) {
        String mensagem = "";
        try {
            People people = this.peopleService.findById((long) 2);
            mensagem = people.getName();
        } catch (GenericExpection e) {
            mensagem = e.getMessage();
        }

        model.addAttribute("mensagem", mensagem);
        return "index";
    }

}
