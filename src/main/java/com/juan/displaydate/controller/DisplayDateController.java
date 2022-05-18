package com.juan.displaydate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date myDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d zzz yyy");
		String formattedDate = formatter.format(myDate);
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date myDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String formattedTime = formatter.format(myDate);
		model.addAttribute("time", formattedTime);
		return "time.jsp";
	}
}
