package com.mainproject.wrieating.dbsource.fooddb;

import com.mainproject.wrieating.dbsource.fooddb.entity.FoodData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataWriter {
    public static void saveDataToDatabase(List<FoodData> dataList) throws IOException, SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query =
                    "INSERT INTO food_data (no, food_name, food_rough_Type, food_detail_type, serving_size, kcal, carbohydrate, fat, protein,  total_sugar, natrium) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            for (FoodData data : dataList) {
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, data.getNo());
                pstmt.setString(2, data.getFoodName());
                pstmt.setString(3, data.getFoodRoughType());
                pstmt.setString(4, data.getFoodDetailType());
                pstmt.setString(5, data.getServingSize());
                pstmt.setInt(6, data.getKcal());
                pstmt.setInt(7, data.getCarbohydrate());
                pstmt.setInt(8, data.getFat());
                pstmt.setInt(9, data.getProtein());
                pstmt.setInt(10, data.getTotalSugar());
                pstmt.setInt(11, data.getNatrium());

                pstmt.executeUpdate();
                pstmt.close();
            }
        }
    }
}
