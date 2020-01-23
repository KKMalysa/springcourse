package pl.karolmalysa.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.karolmalysa.springcourse.components.TimeComponent;
import pl.karolmalysa.springcourse.domain.Knight;
import pl.karolmalysa.springcourse.domain.repository.PlayerInformation;
import pl.karolmalysa.springcourse.services.KnightService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService service;

    @Autowired
    TimeComponent timeComponent;

    @Autowired
    PlayerInformation playerInformation;

    @RequestMapping("/knights")
    public String getKnights(Model model){
        List<Knight> allKnights = service.getAllKnights();
        model.addAttribute( "knights", allKnights);
        model.addAttribute( "timecomponent", timeComponent);
        model.addAttribute( "playerInformation", playerInformation);

        return "knights";
    }
    @RequestMapping("/knight") //@RequestParam to sposób na pobranie parametru z adresu URL
    public String getKnight(@RequestParam("id") Integer id, Model model) {
        Knight knight = service.getKnight(id);
        model.addAttribute("knight", knight);
        model.addAttribute( "timecomponent", timeComponent);
        model.addAttribute( "playerInformation", playerInformation);
        return "knight";
    }


    //   tutaj tworzy sie pusty obiekt rycerza, który jest dodawany do modelu i wysyłany do formularza
    @RequestMapping("/newknight")
    public String createKnight(Model model) {
        model.addAttribute("knight", new Knight());
        model.addAttribute( "timecomponent", timeComponent);
        model.addAttribute( "playerInformation", playerInformation);

        return "knightform";
    }

    @RequestMapping(value = "/knights", method = RequestMethod.POST)
    public String saveKnight(@Valid Knight knight, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("There were errors");
            bindingResult.getAllErrors().forEach(error -> {
                System.out.println(error.getObjectName() + " " + error.getDefaultMessage());
            });

            return "knightform";
        }else {
            service.saveKnight(knight);

            return "redirect:/knights";
        }
    }

    @RequestMapping(value = "/knight/delete/{id}")
    public String deleteKnight(@PathVariable ("id") Integer id){
        service.deleteKnight(id);

        return "redirect:/knights";
    }

}
