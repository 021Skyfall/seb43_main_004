package com.mainproject.wrieating.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DiariesResponseDto {
    private String userDate;
    private String diaryStatus;
}
