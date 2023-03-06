package com.study.service;

import com.study.model.MemberTO;
import com.study.repository.HomeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeMapper homeMapper;
    public String viewNow(){
        return homeMapper.selectNow();
    }

    public MemberTO selectOne(){
        return homeMapper.selectOne();
    }

    public MemberTO findOne(int id){
        MemberTO to = homeMapper.findOneById(id);
        return to;
    }

    public List<MemberTO> memberList(){
        return homeMapper.findAll();
    }
}
