package peter.springpetclinic.peterpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // When there is a request that comes in to the
    // "root context", "root slash", "index", or "index.html",
    // they're all going to get matched to this @RequestMapping.
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
