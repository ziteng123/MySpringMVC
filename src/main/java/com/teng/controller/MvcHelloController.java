package com.teng.controller;


import com.teng.pojo.User;
import com.teng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MvcHelloController implements Controller {
    @Autowired
    private UserService userService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Hello");
        User user = userService.get();
        modelAndView.addObject("user",user);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(request,response);
        return null;
    }
}
