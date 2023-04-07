package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{

    private static final CarServiceImp INSTANCE = new CarServiceImp();

    private static List<Car> carList = new ArrayList<>();

    private CarServiceImp() {}

    static {
        carList.add(new Car("BMW", 6, 2015));
        carList.add(new Car("Ford", 3, 2019));
        carList.add(new Car("Audi", 3, 2021));
        carList.add(new Car("Toyota", 5, 2018));
        carList.add(new Car("Honda", 7, 2022));
    }

    public static CarServiceImp getInstance(){
        return INSTANCE;
    }

    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> listCars(int amount) {
        return carList.subList(0, amount);
    }

    public int getCarCount() {
        return carList.size();
    }
}