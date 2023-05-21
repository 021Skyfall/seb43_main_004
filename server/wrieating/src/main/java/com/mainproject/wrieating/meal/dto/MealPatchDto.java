package com.mainproject.wrieating.meal.dto;

import com.mainproject.wrieating.meal.entity.Meal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MealPatchDto {

    private Long mealId;
    private String title;
    private Meal.MealType mealType;
    private int carbohydrate;
    private int protein;
    private int fat;
    private int kcal;
    private int sugar;
    private int salt;

    public enum MealType {
        BREAKFAST,
        LUNCH,
        DINNER,
        SNACK
    }
}