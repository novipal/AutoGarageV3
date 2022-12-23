package nl.novi.autogaragev2.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RepairDto {
    @NotNull
    private Long id;

    private String name;
    private double price;
}
