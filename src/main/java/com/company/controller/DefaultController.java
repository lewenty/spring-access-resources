package com.company.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class DefaultController {

    @Value("${db.url}")
    public String dbUrl;


    @Value("${db.user}")
    public String dbUser;


    @Value("${db.pass}")
    public String dbPass;


    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");

        model.addAttribute("url", this.dbUrl); // url bilgisini ekle
        model.addAttribute("user", this.dbUser); // user bilgisini ekle
        model.addAttribute("pass", this.dbPass); // pass bilgisini ekle


        return "index";
    }


}