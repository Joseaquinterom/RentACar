package org.example.controller;

import org.example.model.Car;
import org.example.model.Client;
import org.example.service.CarServiceImpl;
import org.example.service.ICarService;

import java.util.ArrayList;

/**
 * @Author: José Antonio Quintero Maya
 */
public class CarController {
    private ICarService service;

    public CarController () {
        service = new CarServiceImpl();
    }

    public void add(String licensePlate){
        Car car = new Car(licensePlate);
        service.add(car);

    }

    public void deleteById(Long id){
        service.deleteById(id);
    }

    public ArrayList findAll(){
        return service.findAll();
    }

    public Car findBylicensePlate( String licensePlate){
        return service.findBylicensePlate(licensePlate);
    }

    public void update(Long id, String licensePlate) {
        Car car = new Car(id,licensePlate);
        service.update(car);
    }


}
