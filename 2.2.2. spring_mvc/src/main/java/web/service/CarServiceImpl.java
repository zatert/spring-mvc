package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.controller.CarController;

public class CarServiceImpl implements CarService{

    @Autowired
    private CarController carController;

    @Override
    public int CarCount() {
        return carController.getSize();
    }
}
//  Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//  Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//  При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//   при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.