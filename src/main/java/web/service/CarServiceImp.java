package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    public static final List<Car> carList = new ArrayList<>(List.of(new Car("Honda",25677,"Lex Luthor"),
            new Car("BMW",13656,"Bruce Wayne"),
            new Car("Mazda",11524,"James Gordon"),
            new Car("Audi",13320,"Mark Spector"),
            new Car("Ford",11177,"Henry Ford")));

    public List<Car> getCar(List<Car> carList, int count) {
        if(count > carList.size() || count < 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
