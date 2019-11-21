package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.News;
import com.test.entity.User;
import com.test.service.NewsService;
import com.test.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
    UserService userService;
	@Autowired
    NewsService newsService;

    @RequestMapping("/view")
    public String view() {
        return "main/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User model, HttpSession session) {
        User user = userService.findByUsername(model.getUsername());
        News news = newsService.findnews();
        if (user == null || !user.getPassword().equals(model.getPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            session.setAttribute("user", user);
            session.setAttribute("news", news);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }
    }
}