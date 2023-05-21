package com.mainproject.wrieating.diary.repository;

import com.mainproject.wrieating.diary.entity.Diary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    Diary findByUserDate(final LocalDate userDate);
    Page<Diary> findAllByMemberMemberId(final Long memberId, PageRequest pageRequest);

    List<Diary> findAllByUserDateBetween(LocalDate startOfWeek, LocalDate endOfWeek);

}

