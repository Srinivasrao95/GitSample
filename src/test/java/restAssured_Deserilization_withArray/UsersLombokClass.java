package restAssured_Deserilization_withArray;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsersLombokClass {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
