package nl.novi.autogaragev2.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PartDto {
    @NotNull
    private Long id;

    private String type;
    private String name;
}
