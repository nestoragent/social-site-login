package com.nestor.controller;

import com.nestor.logic.Sessions;
import com.nestor.util.Factory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by sbt-velichko-aa on 16.03.17.
 */
@Controller
public class BaseController {

    private static final String VIEW_INDEX = "index";
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
    private static int counter = 0;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        ArrayList<String> buttons = new ArrayList<>();
        buttons.add("Twitter");
        buttons.add("Facebook");
        buttons.add("Vkontakte");
        mv.addObject("buttonsList", buttons);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "loginButtons", method = RequestMethod.POST, params = "Twitter")
    public ModelAndView loginTwitter(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/{save}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String save,
                              @RequestParam String timeStart,
                              @RequestParam String timeEnd,
                              ModelMap model) {

        model.addAttribute("message", "Welcome " + save);
        model.addAttribute("counter", ++counter);
        logger.debug("[welcomeName] counter : {}", counter);
        saveData(timeStart, timeEnd);
        return VIEW_INDEX;

    }

    private void saveData(String timeStart, String timeEnd) {
        Sessions sessions = new Sessions();
        sessions.setTimeStart(timeStart);
        sessions.setTimeEnd(timeEnd);
        try {
            Factory.getInstance().getSessionsDAO().addSession(sessions);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
