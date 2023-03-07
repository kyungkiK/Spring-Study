package com.study.repository;

import com.study.model.MemberTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GuestMapper {

    @Insert("insert into member values(0, #{name}, #{password}, #{email})")
    int save(MemberTO to);
}
