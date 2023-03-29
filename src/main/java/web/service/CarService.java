package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

public List<Car> getCar(List<Car> carList, int count) {
    return carList.stream().limit(count).collect(Collectors.toList());
}

}
