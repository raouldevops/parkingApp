package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.demo.service.AbonnementClientService;

@Controller
public class ClientAbonnementController {
	@Autowired
	AbonnementClientService abonnementClientService;
	
	@GetMapping(value = "/parking")
	public String getAbonnementClientPage(Model model) {
		model.addAttribute("ListParkings", abonnementClientService.getAllAbonnementCustomer());
		return "abonnementCustomers/parking";
	}
	
	@GetMapping(value = "/newParking")
	public String getNewAbonnementClientPage() {
		return "abonnementCustomers/newParking";
	}
	
	
	

}
