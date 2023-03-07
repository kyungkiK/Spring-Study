package com.study.repository;

import com.study.model.MemberTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {

    @Select("select id, name, email from member where id = #{id}")
    MemberTO selectOneById(int id);

    @Update("update member set name = #{name}, email = #{email}, password = #{password} where id = #{id}")
    int updateMember(MemberTO to);

    @Delete("delete from member where id = #{id} and password = #{password}")
    int deleteMember(MemberTO to);
}
