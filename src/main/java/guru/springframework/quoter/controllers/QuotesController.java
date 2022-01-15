package guru.springframework.quoter.controllers;

import guru.springframework.quoter.services.Quoter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class QuotesController {

    private final Quoter quoter;

    public QuotesController(Quoter quoter) {
        this.quoter = quoter;
    }
    @RequestMapping(value = "/")
    public String getRandomQuote(Model model){
        model.addAttribute("joke",quoter.sayRandomQuote());

        return "index";
    }
}
