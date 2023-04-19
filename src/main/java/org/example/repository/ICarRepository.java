package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;

/**
 * @Author: José Antonio Quintero Maya
 */
public interface ICarRepository {
    void add(Car car);
    void deleteById(Long id);
    ArrayList findAll();
    public Long nextIdAvailable();
    Car findById(Long id);
    Car findBylicensePlate(String licensePlate);
    void update(Car car);

}
