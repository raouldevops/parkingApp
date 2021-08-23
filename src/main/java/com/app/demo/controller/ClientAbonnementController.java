package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.demo.entities.Abonnement;
import com.app.demo.entities.Client;
import com.app.demo.entities.ClientAbonnement;
import com.app.demo.service.AbonnementClientService;
import com.app.demo.service.AbonnementService;
import com.app.demo.service.ClientService;

@Controller
public class ClientAbonnementController {
	@Autowired
	AbonnementClientService abonnementClientService;
	
	@Autowired
	AbonnementService abonnementService;
	
	@Autowired
	ClientService clientService;
	
	@GetMapping(value = "/parking")
	public String getAbonnementClientPage(Model model) {
		model.addAttribute("ListParkings", abonnementClientService.getAllAbonnementCustomer());
		return "abonnementCustomers/parking";
	}
	
	@GetMapping(value = "/newParking")
	public String getNewAbonnementClientPage(Model model) {
		ClientAbonnement clientAbonnement=new ClientAbonnement();
		
		model.addAttribute("typeAbonnements", abonnementService.getAllAbonnement());
		model.addAttribute("clients", clientService.getAllClient());
		
		model.addAttribute("clientAbonnement", clientAbonnement);
		return "abonnementCustomers/newParking";
	}
	
	@PostMapping(value = "/saveParking")
	public String saveNewCustomer(@ModelAttribute("clientAbonnement") ClientAbonnement clientAbonnement, RedirectAttributes redirAttrs) {
		if (abonnementClientService.saveClientAbonnement(clientAbonnement)==null) {
	        redirAttrs.addFlashAttribute("error", "Une erreur est survenue...");
	        return "redirect:/parking";
	    }else {
	    	redirAttrs.addFlashAttribute("success", "Sauvegarde reussie avec succès...");
	    	return "redirect:/parking";
	    }
		
	}
	
	
	
	
	

}
