package demo;


import demo.service.BddConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adrien on 09/03/2015.
 */
@Controller
public class HomeController {

    @Autowired
    BddConnection service;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("clients",service.getClients());
        return "index";
    }
}
