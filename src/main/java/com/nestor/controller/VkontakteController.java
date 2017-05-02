package com.nestor.controller;

import com.nestor.util.Props;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for twitter OAuth
 * Created by sbt-velichko-aa on 16.03.17.
 */
@Controller
@RequestMapping("/Vkontakte")
public class VkontakteController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
    private String authorizeUrl = "https://oauth.vk.com/authorize?client_id=%s&display=%s&redirect_uri=%s&scope=%s&response_type=code&v=%s";

    /**
     * controller for vk get authorize and get access
     *
     * @return
     */
    @RequestMapping(value = "loginButtons", method = RequestMethod.POST, params = "Vkontakte")
    public ModelAndView getCode() {
        String redirect = String.format(authorizeUrl,
                Props.get("vk.client_id"),
                "page",
                "http://localhost:8080/webservice/codeHandle",
                "friends",
                "5.63");
        logger.debug("info", "Redirect to the url: " + redirect);
        System.out.println("info Redirect to the url: " + redirect);
        return new ModelAndView("redirect:" + redirect);
    }

    /**
     * controller for vk get authorize and get access
     *
     * @return
     */
    @RequestMapping(value = "/codeHandle", method = RequestMethod.GET)
    public ModelAndView codeHandle(
            @RequestParam(value = "code", required = false) String code,
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "error_description", required = false) String errorDescription) {
        logger.debug("info", "Redirect result code: " + code + ", error: " + error + ", errorDescription" + errorDescription);
//        String redirect = String.format(authorizeUrl,
//                Props.get("vk.client_id"),
//                "page",
//                "http://localhost:8080/webservice/codeHandle",
//                "friends",
//                "5.63");
//        logger.debug("info", "Redirect to the url: " + redirect);
//        System.out.println("info Redirect to the url: " + redirect);
//        return new ModelAndView("redirect:" + redirect);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}
