package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
  //  private int size;

    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String secondPage(@RequestParam(value = "count", required = false) Integer count, //HttpServletRequest request,
                             Model model){

        model.addAttribute("list", carService.CarCount(count));
        return "cars";
    }

//    public int getSize() {
//        return size;
//    }
}
//перенести иницилизацию листа в сервис
//и логику проверки тоже
//в контроллере вызов метода и ретерн

//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//3. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//4. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//5. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.