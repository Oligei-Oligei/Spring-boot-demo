package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";      // 这个返回值表示当前控制器方法返回的参数模型用于渲染 greeting.html 页面，依旧是说这个返回值
                                // 用于查找对应的 html 文件用的
    }
}
