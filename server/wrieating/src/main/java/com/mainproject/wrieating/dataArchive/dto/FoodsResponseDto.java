package com.mainproject.wrieating.dataArchive.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodsResponseDto {
    private Long foodId;
    private String foodName;
    private String foodRoughType;
    private String foodDetailType;
    private int servingSize;
    private int kcal;
    private int carbohydrate;
    private int protein;
    private int fat;
    private int totalSugar;
    private int natrium;
}
