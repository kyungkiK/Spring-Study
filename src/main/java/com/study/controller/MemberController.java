package com.study.controller;

import com.study.model.MemberTO;
import com.study.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/mypage")
    public String myPageView(@RequestParam("id") int id, Model model){
        model.addAttribute("to", memberService.selectMyInfo(id));
        return "/member/mypage";
    }

    @PostMapping("/mypage")
    public String myPageView(MemberTO to, Model model){
        model.addAttribute("id", to.getId());
        model.addAttribute("flag", memberService.updateMember(to));
        return "/member/mypageAction";
    }

    @GetMapping("/delete")
    public String memberDelete(@RequestParam("id") int id, Model model){
        model.addAttribute("to", memberService.selectMyInfo(id));
        return "/member/delete";
    }

    @PostMapping("/delete")
    public String memberDelete(MemberTO to, Model model){
        model.addAttribute("id", to.getId());
        model.addAttribute("flag", memberService.deleteMember(to));
        return "/member/deleteAction";
    }

}
