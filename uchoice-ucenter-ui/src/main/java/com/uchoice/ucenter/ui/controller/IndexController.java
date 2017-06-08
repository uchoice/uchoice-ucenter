package com.uchoice.ucenter.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ${admin} on 2017/5/29.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/index");
        return mav;
    }
}
