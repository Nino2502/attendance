package com.asitencia_qro.attendance.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RoleViewController {

    @GetMapping
    public String rolesPage(){
        return "roles/list";
    }
}
