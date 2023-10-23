package bfdc.uasz.sbcar2.web;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bfdc.uasz.sbcar2.domain.Car;
import bfdc.uasz.sbcar2.domain.CarRepository;

@RestController
public class CarController {
    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    // @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return repository.findAll(); 
    }
}
