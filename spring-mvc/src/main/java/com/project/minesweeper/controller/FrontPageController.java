package com.project.minesweeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.minesweeper.controller.response.GameModelAndView;

@Controller
public class FrontPageController {

    @RequestMapping("/")
    public ModelAndView renderFrontPage() {
        return new GameModelAndView("index");
    }
}
