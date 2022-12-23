package nl.novi.autogaragev2.controller;

import nl.novi.autogaragev2.dto.CarDto;
import nl.novi.autogaragev2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Object> newCar(@Valid @RequestBody CarDto carDto, BindingResult br){
        StringBuilder sb = new StringBuilder();
        if(br.hasErrors()){
            for(FieldError error : br.getFieldErrors()){
                sb.append(error.getField() + ": ");
                sb.append(error.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
        } else {
            CarDto newCarDto = carService.createCar(carDto);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(newCarDto.getId()).toUri();
            return ResponseEntity.created(location).build();
        }
    }

}
