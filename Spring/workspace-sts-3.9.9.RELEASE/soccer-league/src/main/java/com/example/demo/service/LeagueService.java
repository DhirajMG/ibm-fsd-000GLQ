package com.example.demo.service;

import java.util.List;

import com.example.demo.model.League;



public interface LeagueService {

	public List<League> findAll();
	
	public League findById(int theId);
	
	public void save(League theLeague);
	
	public void deleteById(int theId);
	
}