package nl.novi.autogaragev2.service;

import nl.novi.autogaragev2.dto.CarDto;
import nl.novi.autogaragev2.model.Car;
import nl.novi.autogaragev2.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public CarDto createCar(CarDto carDto){
        Car car= toCar(carDto);
        Car newCar = carRepository.save(car);
        CarDto dto = fromCar(newCar);
        return dto;
    }

    public static CarDto fromCar(Car car){
        CarDto dto = new CarDto();
        dto.setId(car.getId());
        dto.setVin(car.getVin());
        dto.setLicensePlate(car.getLicensePlate());
        dto.setModel(car.getModel());
        dto.setBrand(car.getBrand());
        dto.setBuildYear(car.getBuildYear());

        return dto;
    }

    public static Car toCar(CarDto dto){
        Car car = new Car();
        car.setId(dto.getId());
        car.setVin(dto.getVin());
        car.setLicensePlate(dto.getLicensePlate());
        car.setModel(dto.getModel());
        car.setBrand(dto.getBrand());
        car.setBuildYear(dto.getBuildYear());

        return car;
    }
}
