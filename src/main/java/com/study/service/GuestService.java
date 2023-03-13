package com.study.service;

import com.study.model.MemberTO;
import com.study.repository.GuestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestService {

    private final GuestMapper guestMapper;

    public int joinMember(MemberTO to){

        int result = guestMapper.save(to);
        int flag = 1;
        if(result == 1){
            flag = 0;
        } else{
            flag = 1;
        }

        return flag;
    }

    public MemberTO loginMember(MemberTO to){
        MemberTO member = guestMapper.checkMember(to);
        return member;
    }
}
