package org.example.repository;

import org.example.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author: José Antonio Quintero Maya
 */

class CarRepositoryTest {

    CarRepository repository;

    @BeforeEach
    void setUp() {
    repository = new CarRepository();
        Car car1 = new Car("ADFG");
        Car car2 = new Car("FGH");
        Car car3 = new Car("BCZ");
        repository.add(car1);
        repository.add(car2);
        repository.add(car3);
    }

    @Test
    void add() {
        Car car4 = new Car("ASL");
        repository.add(car4);
        Assertions.assertEquals(4,repository.findAll().size());
        Car car5 = new Car("VCS");
        repository.add(car5);
        Assertions.assertEquals(5,repository.findAll().size());


    }

    @Test
    void findAll() {
        Assertions.assertEquals(3, repository.findAll().size());
        Car car = new Car("VBN");
        repository.add(car);
        Assertions.assertEquals(4, repository.findAll().size());
        repository.deleteById(2L);
        Assertions.assertEquals(3, repository.findAll().size());
    }


    @Test
    void deleteById() {
        Assertions.assertEquals(3, repository.findAll().size());
        repository.deleteById(4L); // Don't exist
        Assertions.assertEquals(3, repository.findAll().size());
        repository.deleteById(3L);
        Assertions.assertEquals(2, repository.findAll().size());
        repository.deleteById(2L);
        Assertions.assertEquals(1, repository.findAll().size());
        repository.deleteById(1L);
        Assertions.assertEquals(0, repository.findAll().size());
    }



    @Test
    void nextIdAvailable() {
        Assertions.assertEquals(4, repository.nextIdAvailable());
        Car car = new Car("FGH");
        repository.add(car);
        Assertions.assertEquals(5, repository.nextIdAvailable());
        repository.deleteById(1L);
        Assertions.assertEquals(5, repository.nextIdAvailable());

    }

    @Test
    void findById() {
        Assertions.assertEquals(1L,repository.findById(1L).getIdCar());
        Assertions.assertEquals("FGH", repository.findById(2L).getLicensePlaze());
    }

    @Test
    void findBylicensePlate() {
        Assertions.assertEquals(1, repository.findById(1L).getIdCar());
        Assertions.assertEquals("FGH", repository.findBylicensePlate("FGH").getLicensePlaze());
    }

    @Test
    void update() {
        Assertions.assertEquals("ADFG", repository.findById(1L).getLicensePlaze());
        Car car = new Car(1L, "CVB");
        repository.update(car);
        Assertions.assertEquals("CVB", repository.findById(1L).getLicensePlaze());
    }
}