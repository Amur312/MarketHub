package ru.markethub.wildberries.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WildberriesResponse {

    private DataResponse data;
    private boolean error;
    private String errorText;
    private List<AdditionalError> additionalErrors;

    @Data
    @NoArgsConstructor
    public static class DataResponse {
        private Integer page;
        private Boolean isNextPage;
        private List<Card> cards;
    }

    @Data
    @NoArgsConstructor
    public static class Card {
        private Integer nmID;
        private String vendorCode;
        private String brandName;
        private List<Tag> tags;
        private ObjectInfo object;
        private Statistics statistics;
        private Stocks stocks;
    }

    @Data
    @NoArgsConstructor
    public static class Tag {
        private Integer id;
        private String name;
    }

    @Data
    @NoArgsConstructor
    public static class ObjectInfo {
        private Integer id;
        private String name;
    }

    @Data
    @NoArgsConstructor
    public static class Statistics {
        private Period selectedPeriod;
        private Period previousPeriod;
        private PeriodComparison periodComparison;
    }

    @Data
    @NoArgsConstructor
    public static class Period {
        private String begin;
        private String end;
        // Другие поля, например, openCardCount, addToCartCount...
        private Conversions conversions;
    }

    @Data
    @NoArgsConstructor
    public static class Conversions {
        private Double addToCartPercent;
        private Double cartToOrderPercent;
        private Double buyoutsPercent;
    }

    @Data
    @NoArgsConstructor
    public static class PeriodComparison {
        // Поля для сравнения периодов, например, openCardDynamics...
    }

    @Data
    @NoArgsConstructor
    public static class Stocks {
        private Integer stocksMp;
        private Integer stocksWb;
    }

    @Data
    @NoArgsConstructor
    public static class AdditionalError {
        private String field;
        private String description;
    }
}