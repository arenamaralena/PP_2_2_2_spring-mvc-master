package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int START_OF_LIST = 0;
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "blue", 345));
        cars.add(new Car("Honda", "red", 450));
        cars.add(new Car("Toyota", "yellow", 670));
        cars.add(new Car("Lada", "black", 455));
        cars.add(new Car("Reno", "pink", 222));
    }

    @Override
    public List<Car> getSomeCars(int amount) {
        if (amount >= cars.size()) {
            return cars;
        }
        return cars.subList(START_OF_LIST, amount);
    }
}
