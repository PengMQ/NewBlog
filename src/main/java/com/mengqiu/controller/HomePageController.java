package com.mengqiu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView renderHomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homepage/index");

        return modelAndView;
    }
}
