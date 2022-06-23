package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarsDAO carsDAO;

    @Autowired
    public CarsController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping()
    public String fewCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        model.addAttribute("cars", carsDAO.carCount(count));
        return "cars";
    }
}

