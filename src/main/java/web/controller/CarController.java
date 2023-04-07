package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") String count, Model model) {
        model.addAttribute("CarsToShow", CarServiceImp.getInstance()
                .listCars(Math.min(5, Integer.parseInt(count))));
        return "cars";
    }
}