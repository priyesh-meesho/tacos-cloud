package tacos;


import lombok.Data;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
    @NotNull
    @Size(min=5,message="name must be at least 5 characters long")
    private String name;
    @Size(min=1,message="you must select at least 1 ingredient")
    private List<String> ingredients;
}
