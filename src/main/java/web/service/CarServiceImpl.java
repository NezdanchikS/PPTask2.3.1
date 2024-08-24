package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", "series001", 500));
        cars.add(new Car("model2", "series022", 100));
        cars.add(new Car("model3", "series003", 12000));
        cars.add(new Car("model4", "series420", 300));
        cars.add(new Car("model5", "series132", 2500));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
