package restAssured_deserilization;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLombokclass {

    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;

}
