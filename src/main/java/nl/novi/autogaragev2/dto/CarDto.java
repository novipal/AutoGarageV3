package nl.novi.autogaragev2.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CarDto {
    @NotNull
    private Long id;

    @Length(min = 17, max = 17)
    private String vin;

    private String licensePlate;
    private String model;
    private String brand;
    private int buildYear;
}
