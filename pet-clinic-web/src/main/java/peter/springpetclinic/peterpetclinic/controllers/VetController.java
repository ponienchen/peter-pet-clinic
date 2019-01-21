package peter.springpetclinic.peterpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/veets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
