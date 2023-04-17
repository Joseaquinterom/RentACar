package org.example.repository;

import org.example.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Andrés Fernández Pereira
 */
class CarRepositoryTest {

    CarRepository repository;

    @BeforeEach
    void setUp() {
        repository = new CarRepository();
        Car car1 = new Car("ADFG");
        Car car2 = new Car("FGH");
        Car car3 = new Car("HCW");
        repository.add(car1);
        repository.add(car2);
        repository.add(car3);
    }

    @Test
    void add() {
        Car car3 = new Car("ASL");
        repository.add(car3);
        Assertions.assertEquals(car3,repository.findById(3L));
        

    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void nextIdAvailable() {
    }

    @Test
    void findById() {
    }

    @Test
    void findBylicensePlate() {
    }

    @Test
    void update() {
    }
}