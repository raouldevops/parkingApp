package com.app.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.demo.entities.Abonnement;
import com.app.demo.service.AbonnementService;

@Controller
public class AbonnementController {
	@Autowired
	AbonnementService abonnementService;
	
	@GetMapping(value = "/abonnements")
	public String viewNewAbonnePage(Model model) {
		Abonnement abonnement=new Abonnement();
		model.addAttribute("ListAbonnement", abonnementService.getAllAbonnement());
		model.addAttribute("abonnement", abonnement);
		return "abonnements/abonnements";
	}
	
	@PostMapping(value = "/saveTypeAbonnement")
	public String saveNewTypeAbonnement(@ModelAttribute("abonnement") @Valid Abonnement abonnement,RedirectAttributes redirAttrs) {
	
		if (abonnementService.saveAbonnement(abonnement)==null) {
			redirAttrs.addFlashAttribute("error", "Une erreur est survenue...");
	        return "redirect:/abonnements";
	    }else {
	    	redirAttrs.addFlashAttribute("success", "Enregistrement reussi avec succès...");
	    	return "redirect:/abonnements";
	    }
	}
	
	

}
