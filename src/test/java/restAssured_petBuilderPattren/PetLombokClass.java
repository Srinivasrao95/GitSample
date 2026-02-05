package restAssured_petBuilderPattren;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetLombokClass {
    private Integer id;
    private String name;
    private String status;
    private List<String> photoUrls;
    private Category category;
    private List<Tags> tags;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Category {
        private Integer id;
        private String name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Tags {
        private Integer id;
        private String name;
    }


}
