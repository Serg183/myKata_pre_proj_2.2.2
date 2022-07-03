package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.service.CarsService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    private CarsService carsService;

    @GetMapping()
    public String fewCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        model.addAttribute("cars", carsService.carCount(count));
        return "cars";
    }
}

