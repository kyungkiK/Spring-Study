package com.study.controller;

import com.study.model.MemberTO;
import com.study.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class GuestController {

    private final GuestService guestService;

    @GetMapping("/guest/join")
    public String joinMember(){
        return "/guest/join";
    }

    @PostMapping("/guest/join")
    public String joinMember(MemberTO to, Model model){
        model.addAttribute("flag", guestService.joinMember(to));
        return "/guest/joinAction";
    }
}
