package com.mainproject.wrieating.meal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Day {
    private Long totalKcal;
    private Long totalCarbohydrate;
    private Long totalProtein;
    private Long totalFat;
    private Long totalSugar;
    private Long totalSalt;

    public Day(Long totalKcal, Long totalCarbohydrate, Long totalProtein, Long totalFat, Long totalSugar, Long totalSalt) {
        this.totalKcal = totalKcal;
        this.totalCarbohydrate = totalCarbohydrate;
        this.totalProtein = totalProtein;
        this.totalFat = totalFat;
        this.totalSugar = totalSugar;
        this.totalSalt = totalSalt;
    }
}