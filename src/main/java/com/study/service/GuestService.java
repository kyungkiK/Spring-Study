package com.study.service;

import com.study.model.MemberTO;
import com.study.repository.GuestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestService {

    private final GuestMapper guestMapper;

    public int joinMember(MemberTO to) {

        // 회원가입시 자동으로 일반 유저 권한 부여
        to.setRole("ROLE_USER");

        int result = guestMapper.save(to);
        int flag = 1;
        if(result == 1){
            flag = 0;
        } else{
            flag = 1;
        }

        return flag;
    }

    public MemberTO loginMember(MemberTO to) {
        MemberTO member = guestMapper.checkMember(to);
        return member;
    }
}
