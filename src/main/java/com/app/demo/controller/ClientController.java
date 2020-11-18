package com.app.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.demo.entities.Client;
import com.app.demo.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;

	// Afficher la liste des clients sur la page Client.html
	@GetMapping(value = "/")
	public String viewHomePage() {
		return "index";
	}

	// Afficher la liste des clients sur la page Client.html
	@GetMapping(value = "/customers")
	public String viewHomePage(Model model) {
		model.addAttribute("ListClients", clientService.getAllClient());
		return "/customers/customers";
	}

	@GetMapping(value = "/newCustomer")
	public String viewNewCustomerPage(Model model) {
		Client client=new Client();
		model.addAttribute("client", client);
		return "/customers/newCustomer";
	}
	
	@PostMapping(value = "/saveCustomer")
	public String saveNewCustomer(@ModelAttribute("client") Client client,RedirectAttributes redirAttrs) {
		if (clientService.saveClient(client)==null) {
	        redirAttrs.addFlashAttribute("error", "Une erreur est survenue...");
	        return "redirect:/customers";
	    }else {
	    	redirAttrs.addFlashAttribute("success", "Enregistrement reussi avec succès...");
	    	return "redirect:/customers";
	    }
		
		//clientService.saveClient(client);
		//return "redirect:/customers/";
	}
	
	
	@GetMapping("/support")
    public String showSupport(){
		return "/support";
    }


}
