package com.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poc.entity.Appointment;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String home(Model model) {
		
		return "index";
	}
	
	@GetMapping("/book-appointment")
	public String bookAppointment(Model model) {
		
		return "book_appointment";
	}
	
	@PostMapping("/book")
	public String addAppointmentData(@ModelAttribute Appointment a) {
		System.out.println(a);
		return "book_appointment";
	}
}
