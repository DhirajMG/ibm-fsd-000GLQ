package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.League;
import com.example.demo.service.LeagueService;


@Controller
@RequestMapping("/leagues")
public class LeagueController {

	private LeagueService leagueService;
	
	public LeagueController(LeagueService theLeagueService) {
		leagueService = theLeagueService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listLeagues(Model theModel) {
		
		// get employees from db
		List<League> theLeague = leagueService.findAll();
		
		// add to the spring model
		theModel.addAttribute("league", theLeague);
		
		return "leagues/list-leagues";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		League theLeague = new League();
		
		theModel.addAttribute("league", theLeague);
		
		return "leagues/league-form";
	}
	
	@PostMapping("/save")
	public String saveLeague(@ModelAttribute("league") League theLeague) {
		
		// save the employee
		leagueService.save(theLeague);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/leagues/list";
	}
	
	
}