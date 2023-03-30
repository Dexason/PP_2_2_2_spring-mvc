package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> printCarList = new ArrayList<>(carServiceImp.getCar(CarServiceImp.carList, count));
        model.addAttribute("printCarList", printCarList);
        return "cars";
    }
}
