package com.sys.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sys.beans.CredentialsBean;
import com.sys.beans.UserBean;
import com.sys.services.ILoginService;

@Controller
public class LoginController {

	@Autowired
	ILoginService loginService;
	
	@RequestMapping("toLogin")
	public String toLogin(Model model) {
		model.addAttribute("credentialsBean", new CredentialsBean());
		return "pages/signin";
	}
	
	@RequestMapping("doLogin")
	public ModelAndView doLogin(@ModelAttribute @Valid CredentialsBean credentials, BindingResult result) {
		ModelAndView view = new ModelAndView("pages/signin");
		if(!result.hasFieldErrors()) {
			UserBean userBean = loginService.authenticate(credentials);
			if(userBean != null) {
				view.setViewName("pages/index");
			} else {
				result.addError(new ObjectError("err", "Dati non validi"));
			}
		}
		return view;
	}
	
	
}
