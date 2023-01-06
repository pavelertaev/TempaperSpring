package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping
    public String index() {
        return "Интернет магазин по продаже носков запущен";
    }

}
