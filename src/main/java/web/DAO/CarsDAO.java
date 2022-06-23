package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO  {
    private static int CARS_COUNT;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CARS_COUNT, "car1", "V8"));
        cars.add(new Car(++CARS_COUNT, "car2", "V9"));
        cars.add(new Car(++CARS_COUNT, "car3", "V10"));
        cars.add(new Car(++CARS_COUNT, "car4", "V11"));
        cars.add(new Car(++CARS_COUNT, "car5", "V12"));
    }


    public List<Car> carCount(Integer count) {
        if (count == null){
            return cars;
        }
        return  cars.stream().limit(count).toList();
    }
}

