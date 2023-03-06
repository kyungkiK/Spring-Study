package com.study.repository;

import com.study.model.MemberTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HomeMapper {
    @Select("select now()")
    String selectNow();

    @Select("select id, name from member where id = 1")
    MemberTO selectOne();

    @Select("select id, name from member where id = #{id}")
    MemberTO findOneById(int id);

    @Select("select id, name from member order by id asc")
    List<MemberTO> findAll();

}
