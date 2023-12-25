package ru.markethub.ozon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductListResponseDto {
    private Object result;
    private String lastId;
    private int total;
}
