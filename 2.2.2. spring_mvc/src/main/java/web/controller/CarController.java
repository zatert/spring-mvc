package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    private int size;
    @GetMapping(value = "/cars")
    public String secondPage(@RequestParam(value = "count", required = false) Integer count, //HttpServletRequest request,
                             Model model){
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
            size = count;
           carsList = carsList.stream().limit(count).collect(Collectors.toList());
           // model.addAttribute("list", newList);
        }
            model.addAttribute("list", carsList);
        return "cars";
    }

    public int getSize() {
        return size;
    }
}
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//3. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//4. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//5. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.