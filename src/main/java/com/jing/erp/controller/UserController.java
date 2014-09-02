package com.jing.erp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.jing.erp.bean.Book;
import com.jing.erp.bean.User;
import com.jing.erp.constant.Constants;
import com.jing.erp.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView toLogin(){
		ModelAndView mv = new ModelAndView("user/login");
		return mv;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(User user){
		ModelAndView mv = new ModelAndView();
		User u = userService.findUser(user.getUsername());
		if(null != u && u.getPassword().equals(user.getPassword())){
			mv.setViewName("redirect:/book/books");
			mv.addObject("user", u);
		}else{
			mv.setViewName("user/login");
			mv.addObject("massege", Constants.LOGIN_ERROR);
		}
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request,SessionStatus sessionStatus){
		sessionStatus.setComplete();
		request.getSession().invalidate();
		return new ModelAndView("user/login");
	}
	
}
