package com.study.service;

import com.study.model.MemberTO;
import com.study.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberMapper memberMapper;

    public MemberTO selectMyInfo(int id) {
        return memberMapper.selectOneById(id);
    }

    public int updateMember(MemberTO to){
        int result = memberMapper.updateMember(to);
        int flag = 1;

        if (result == 1) {
            flag = 0;
        } else {
            flag = 1;
        }

        return flag;
    }

    public int deleteMember(MemberTO to){
        int result = memberMapper.deleteMember(to);
        int flag = 1;

        if (result == 1) {
            flag = 0;
        } else {
            flag = 1;
        }

        return flag;
    }
}
