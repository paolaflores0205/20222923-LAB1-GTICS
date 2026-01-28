package com.example.solulab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(name = "/")
public class HomeController {

    //Para el navbar
    @GetMapping("/principal")
    public String paginaPrincipal(@RequestParam(name = "code", required = false) String code, Model model){
        model.addAttribute("codigoRecibido", code);
        return "principal"; //nombre del archivo HTML
    }

}
