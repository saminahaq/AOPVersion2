package com.in28minutes.token;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.in28minutes.model.Token;
import com.in28minutes.token.services.TokenService;


@Controller
public class TokenController {

	@Autowired
	private TokenService service;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@RequestMapping(value = "/list-tokens", method = RequestMethod.GET)
	public String showTokensList(ModelMap model) {
		String user = getLoggedInUserName();
		model.addAttribute("todos", service.retrieveTokens(user));
	System.out.println("list-tokens");
		return "list-tokens";
	}

	@RequestMapping(value = "/add-token", method = RequestMethod.GET)
	public String showAddTokenPage(ModelMap model) {
		model.addAttribute("token", new Token());
		return "token";
	}

	@RequestMapping(value = "/add-token", method = RequestMethod.POST)
	public String addToken(ModelMap model, @Valid Token token, BindingResult result) {

		if (result.hasErrors())
			return "token";

		service.addToken(getLoggedInUserName(), token.getDesc(),
				token.getTargetDate(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-tokens";
	}

	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}

	@RequestMapping(value = "/update-token", method = RequestMethod.GET)
	public String showUpdateTokenPage(ModelMap model, @RequestParam int id) {
		model.addAttribute("token", service.retrieveToken(id));
		return "token";
	}

	@RequestMapping(value = "/update-token", method = RequestMethod.POST)
	public String updateToken(ModelMap model, @Valid Token token,
			BindingResult result) {
		if (result.hasErrors())
			return "token";

		token.setUser(getLoggedInUserName());
		service.updateToken(token);

		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-tokens";
	}
	@RequestMapping(value = "/show-token", method = RequestMethod.GET)
	public String showToken(@RequestParam int id) {
		/*service.deleteToken(id);
*/
		return "redirect:/list-tokens";
	}

	
	@RequestMapping(value = "/delete-token", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		service.deleteToken(id);

		return "redirect:/list-tokens";
	}


	
	
	
	
	

	@RequestMapping(value = "/list-token", method = RequestMethod.GET)
	public String tokenfun() {
		
		return "token";
	}
	
	
	@RequestMapping(value = "/list-certificate", method = RequestMethod.GET)
	public String certificateList() {
		
		return "certificate";
	}
	
}