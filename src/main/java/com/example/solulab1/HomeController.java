package com.example.solulab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/")
public class HomeController {

    //Para el navbar
    @GetMapping("/principal")
    public String paginaPrincipal(){
        return "principal"; //nombre del archivo HTML
    }

}
