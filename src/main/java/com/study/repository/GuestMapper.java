package com.study.repository;

import com.study.model.MemberTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GuestMapper {

    @Insert("insert into member values(0, #{name}, #{password}, #{email}, #{role})")
    int save(MemberTO to);

    @Select("select id, name, email, role from member where name = #{name} and password = #{password}")
    MemberTO checkMember(MemberTO to);
}
