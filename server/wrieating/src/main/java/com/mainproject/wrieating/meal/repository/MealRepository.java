package com.mainproject.wrieating.meal.repository;

import com.mainproject.wrieating.meal.entity.Day;
import com.mainproject.wrieating.meal.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MealRepository extends JpaRepository<Meal, Long> {
    @Query("SELECT new com.mainproject.wrieating.meal.entity.Day(SUM(m.kcal), SUM(m.carbohydrate), SUM(m.protein), SUM(m.fat)) FROM Meal m WHERE m.diary.diaryId = :diaryId")
    Day getMealSummaryByDiaryId(@Param("diaryId") Long diaryId);
}