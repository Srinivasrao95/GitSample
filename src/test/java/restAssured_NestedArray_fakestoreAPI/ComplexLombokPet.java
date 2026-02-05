package restAssured_NestedArray_fakestoreAPI;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComplexLombokPet {

    private Integer id;
    private String name;
    private String status;
    private Category category;
    private List<String> photoUrls;
    private List<Tags> tags;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class Category {
        private Integer id;
        private String name;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class Tags {
        private Integer id;
        private String name;
    }

}
