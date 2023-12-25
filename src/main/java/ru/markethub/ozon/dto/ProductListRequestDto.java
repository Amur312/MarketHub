package ru.markethub.ozon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductListRequestDto {
    private Object filter;
    private String last_id;
    private int limit;
}
