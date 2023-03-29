package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int number;
    private String owner;

    public static final List<Car> carList = new ArrayList<>(List.of(new Car("Honda",25677,"Lex Luthor"),
            new Car("BMW",13656,"Bruce Wayne"),
            new Car("Mazda",11524,"James Gordon"),
            new Car("Audi",13320,"Mark Spector"),
            new Car("Ford",11177,"Henry Ford")));

    public Car(String model, int number, String owner) {
        this.model = model;
        this.number = number;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", owner='" + owner + '\'' +
                '}';
    }
}
