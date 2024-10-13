package mini.Rest.POST;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Generates a default constructor
@AllArgsConstructor // Generates a constructor with all fields
public class Customer {
    
    private Integer id;
    private String name;
    private String email;

    // No need to manually define constructors if using Lombok's annotations
}
