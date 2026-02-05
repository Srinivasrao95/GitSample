package restAssured_NestedArray_fakestoreAPI;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeuserAPILombok {


    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Address address;
    private Name name;



    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Name {
        private String firstname;
        private String lastname;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Address{
        private String city;
        private String street;
        private Integer number;
        private String zipcode;
        private Geolocation geolocation;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Geolocation{
        private String lat;
        @JsonProperty("long")
        private String longitude;
    }
}
