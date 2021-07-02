package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    //private int size;

//    @Autowired
//    private CarController carController;

    @Override
    public List<Car> CarCount(Integer count) {
        List<Car> carsList = new ArrayList<>(5);
        Car car1 = new Car("BMW", "automatic", "red");
        Car car2 = new Car("Kamaz", "manual", "hacks");
        Car car3 = new Car("Zil", "manual", "green");
        Car car4 = new Car("Paz", "manual", "yellow");
        Car car5 = new Car("Bugatti", "automatic", "silver");
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        //Integer count = Integer.parseInt(request.getParameter("count"));
        if( count != null) {  //count < 5 &&
            int size = count;
            carsList = carsList.stream().limit(count).collect(Collectors.toList());
            // model.addAttribute("list", newList);
        }
      //  return carController.getSize();
        return carsList;
    }
}
//  Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//  Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//  При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//   при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.