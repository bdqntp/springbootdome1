package cn.yyhn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HolleController {
    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("hello","hello");
        mv.setViewName("hello");
        return mv;
    }
}
