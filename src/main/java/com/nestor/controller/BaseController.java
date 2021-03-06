package com.nestor.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by sbt-velichko-aa on 16.03.17.
 */
@Controller
public class BaseController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        ArrayList<String> buttons = new ArrayList<>();
        buttons.add("Twitter");
        buttons.add("Facebook");
        buttons.add("Vkontakte");
        mv.addObject("buttonsList", buttons);
        mv.setViewName("index");
        logger.debug("Return index page");
        return mv;
    }
}
