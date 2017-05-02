package com.nestor.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for twitter OAuth
 * Created by sbt-velichko-aa on 16.03.17.
 */
@Controller
@RequestMapping("/Twitter")
public class TwitterController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * controller for twitter OAuth
     *
     * @return
     */
    @RequestMapping(value = "loginButtons", method = RequestMethod.POST, params = "Twitter")
    public ModelAndView loginTwitter() {
        ModelAndView mv = new ModelAndView();

//        HttpRequests.sendPost("", )
        mv.setViewName("login");
        return mv;
    }
}
