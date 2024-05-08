package com.birichani_codes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project_name: Internet-Banking
 * Entity_name: HomeController
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 8 May 2024
 * Time: 13:32
 */
@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "index";
    }
}

