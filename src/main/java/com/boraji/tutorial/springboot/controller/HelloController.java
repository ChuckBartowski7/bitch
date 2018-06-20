package com.boraji.tutorial.springboot.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.boraji.tutorial.springboot.model.Donazione;
import com.boraji.tutorial.springboot.model.Utente;
import com.boraji.tutorial.springboot.repository.*;


@SessionAttributes("nome")
@Controller
public class HelloController {

	@Autowired
	UserRepository repository;
	
	@Autowired
	DonazioneRepository repositoryd;

	@RequestMapping(value = "visualizzaIscritti", method = RequestMethod.GET)
	public String getUtenti(Model model) {
		List<Utente> utenti = new ArrayList<Utente>();
		utenti = (List<Utente>) repository.findAll();
		model.addAttribute("utenti", utenti);
		return "visualizzatutti";

	}
	
	@RequestMapping(value = "visualizzaDonazioni", method = RequestMethod.GET)
	public String getDonazioni(Model model) {
		List<Donazione> donazioni = new ArrayList<Donazione>();
		donazioni = (List<Donazione>) repositoryd.findAll();
		model.addAttribute("donazioni", donazioni);
		return "visualizzadonazioni";

	}
	
	

	@RequestMapping("/tornaIndietro")
	public String indietro() {
		return "adminpage";
	}

	@RequestMapping("/")
	public String index() {
		return "loading";
	}

	@RequestMapping("/indexx")
	public String homes() {
		return "index";
	}

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/teams")
	public String team() {
		return "team";
	}

	@RequestMapping("/evkids")
	public String eventikids() {
		return "kids";
	}

	@RequestMapping("/evnature")
	public String eventinature() {
		return "nature";
	}

	@RequestMapping("/evanim")
	public String eventianimali() {
		return "animali";
	}

	@RequestMapping(value="/profile")
	public String profiloinformazioni(Principal principal,Model model) {
		String username = principal.getName();
		model.addAttribute("prova",username);
		
		
		return "profiloutente";
	}

	@RequestMapping("/admingestion")
	public String gestioneamministratore() {

		return "adminpage";
	}

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String accesso() {
		return "acced";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String accesso2(Model model,@RequestParam("username")String username) {
		model.addAttribute("nome",username);
		return "acced";
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
}
