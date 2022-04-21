package ru.savinov.buyhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HandlerController {

    @GetMapping("/hello")
    public String shopPage(Model model) {
        List<String> list = new ArrayList<>();
        list.add("Hello world");
        list.add("Hello world!");
        list.add("Hello world!!");
        list.add("Hello world!!!");
        model.addAttribute("anyKey", list);
        return "index";
    }

}
