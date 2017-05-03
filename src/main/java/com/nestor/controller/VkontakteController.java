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
@RequestMapping("/vk")
public class VkontakteController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(VkontakteController.class);
    private String authorizeUrl = "https://oauth.vk.com/authorize?client_id=%s&" +
            "display=%s&redirect_uri=%s&scope=%s&response_type=code&v=%s";

    /**
     * controller for vk get authorize and get access
     *
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView getCode() {
        String redirect = String.format(authorizeUrl,
                Props.get("vk.client_id"),
                "page",
                "http://192.168.0.104:8080/vk/codeHandle",
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
    @RequestMapping(value = "codeHandle", method = RequestMethod.GET)
    public ModelAndView codeHandle(
            @RequestParam(value = "code", required = false) String code,
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "error_description", required = false) String errorDescription) {
        System.out.println("data: " + code);
        logger.info("debug", "Redirect result code: " + code + ", error: " + error + ", errorDescription" + errorDescription);
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
