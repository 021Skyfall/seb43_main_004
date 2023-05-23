package com.mainproject.wrieating.dataArchive.repository;

import com.mainproject.wrieating.dataArchive.dbsource.recipedb.entity.RecipeData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeArchiveRepository extends JpaRepository<RecipeData, Long> {
    @Query("SELECT r FROM RecipeData r WHERE r.rcpWay LIKE '%' || :filter || '%'")
    Page<RecipeData> findRecipeByFilter(@Param("filter") String filter,  Pageable pageable);

    @Query("SELECT r FROM RecipeData r WHERE r.rcpName LIKE '%' || :keyword || '%'")
    Page<RecipeData> findRecipeByKeyword(@Param("keyword") String keyword,  Pageable pageable);

    @Query(value = "SELECT rd.* FROM recipedata rd WHERE <custom_query_here> ORDER BY RAND() LIMIT 1", nativeQuery = true)
    RecipeData findRandomRecipeDataWithCustomQuery(@Param("custom_query_here") String customQuery);


}
