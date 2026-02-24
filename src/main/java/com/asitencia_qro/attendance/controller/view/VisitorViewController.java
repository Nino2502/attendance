package com.asitencia_qro.attendance.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/visitors")
public class VisitorViewController {

    @GetMapping
    public String visitorsPage(){
        return "visitors/list";
    }

}
