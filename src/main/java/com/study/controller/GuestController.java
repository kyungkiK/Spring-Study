package com.study.controller;

import com.study.model.MemberTO;
import com.study.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @GetMapping("/login")
    public String loginMember() {

        return "/guest/login";
    }

    @PostMapping("/login")
    public String loginMember(MemberTO to, HttpServletRequest request, Model model) {
        MemberTO member = guestService.loginMember(to);

        HttpSession session = request.getSession();

        if (member != null) {
            session.setAttribute("memberInfo", member);
            session.setAttribute("memberName", member.getName());
            session.setAttribute("memberEmail", member.getEmail());
            session.setAttribute("memberRole", member.getRole());
        }

        model.addAttribute("member", member);

        return "/guest/loginAction";
    }

    @GetMapping("/logout")
    public String logoutMember(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();

        return "redirect:/";
    }

}
