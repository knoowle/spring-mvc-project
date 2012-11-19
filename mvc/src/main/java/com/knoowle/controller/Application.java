package com.knoowle.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.knoowle.model.Account;
import com.knoowle.service.AccountService;

@Controller
public class Application {
	
	private AccountService accountService;
	
	@Autowired
	public Application(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", "welcome to spring mvc project");
		model.addAttribute("logo", "knoowle");
		return "application/index";
	}
	
	@RequestMapping("/addblog")
	public String addBlog(String title, String content, Model model) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("addtime", format.format(new Date()));
		
		return "application/addblog";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("title", "mvc project register");
		return "application/register";
	}
	
	@RequestMapping(value="/register1", method=RequestMethod.POST)
	public @ResponseBody Account register1(String name, String email, String password, String repassword) {
		Account account = new Account();
		account.setName(name);
		account.setEmail(email);
		account.setPassword(password);
		account.setRegisterDate(new Date());
		
		accountService.register(account);
		
		return account;
	}
	
}
