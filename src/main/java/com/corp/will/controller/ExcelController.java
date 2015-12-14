package com.corp.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by will.wang on 2015/12/14.
 */
@Controller
public class ExcelController {

    @RequestMapping("/springMVC/downloadExcel")
    public ModelAndView downloadExcel() {
        ModelAndView modelAndView = new ModelAndView("excelViewResolver");
        return modelAndView;
    }
}
