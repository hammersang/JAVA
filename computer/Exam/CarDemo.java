package kr.ac.ync.computer.Exam;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.List;

public class CarDemo {
    public static List<Car> findCars(List<Car> all, CarPredicate cp){
        List<Car> result = new ArrayList<>();
        for (Car car:all){
            if(cp.test(car)){
                result.add(car);
            }
        }
        return result;
    }
    public static void printCars(List<Car> all, CarConsumer cc){
        for(Car car:all){
            cc.apply(car);
        }
    }
    public static void main(String[] args) {
//        List<Car> dieselCars = findCars(Car.cars,car->!car.isGasoline());
//        System.out.println("디젤 자동차 = " + dieselCars);

//        List<Car> oldDieselCars = findCars(Car.cars, car-> car.getAge()>=10&&!car.isGasoline());
//        System.out.println("오래된(10년) 디젤 자동차 = " + oldDieselCars);

        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("오랜된 자동차 = " + oldCars);

        //오래된 자동차 = 코란토(15, 2000) 싼타페 (10, 22200)
        System.out.print("\n오래된 자동차 = ");
        printCars(oldCars,(Car car) -> System.out.printf("%s(%d,%d) ", car.getModel(),car.getAge(),car.getMileage()));


    }
}
