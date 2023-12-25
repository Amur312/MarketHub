package ru.markethub.wildberries.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class WildberriesRequest {
    private List<String> brandNames;
    private List<Integer> objectIDs;
    private List<Integer> tagIDs;
    private List<Integer> nmIDs;
    private String timezone;
    private Period period;
    private OrderBy orderBy;
    private Integer page;
    @Data
    @NoArgsConstructor
    public static class Period {
        private String begin;
        private String end;
    }

    @Data
    @NoArgsConstructor
    public static class OrderBy {
        private String field;
        private String mode;
    }
}
