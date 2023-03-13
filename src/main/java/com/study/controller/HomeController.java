package com.study.controller;

import com.study.model.MemberTO;
import com.study.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/")
    public String helloView(){

        return "hello";
    }

    @GetMapping("/now")
    @ResponseBody
    public String showNow(){
        return homeService.viewNow();
    }

    @GetMapping("/index")
    public String mainPage(Model model){
        MemberTO to = homeService.selectOne();
        model.addAttribute("to", to);
        return "index";
    }

    @PostMapping("/index")
    public String findMember(@RequestParam("id") int id, Model model){
        MemberTO to = homeService.findOne(id);
        model.addAttribute("to", to);
        return "index";
    }

    @GetMapping("/memberlist")
    public String findAllMembers(Model model){
        List<MemberTO> memberList = homeService.memberList();
        model.addAttribute("memberList", memberList);
        return "allMember";
    }


//    @PostMapping("/index/{id}")
//    @ResponseBody
//    public ResponseEntity<?> findMember(@PathVariable("id") int id){
//        return new ResponseEntity<>(homeService.findOne(id), HttpStatus.OK);
//    } // rest api
}
