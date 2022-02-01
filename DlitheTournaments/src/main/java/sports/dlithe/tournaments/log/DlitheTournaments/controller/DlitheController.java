package sports.dlithe.tournaments.log.DlitheTournaments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import sports.dlithe.tournaments.log.DlitheTournaments.services.AthleteService;
import sports.dlithe.tournaments.log.DlitheTournaments.services.TournamentService;

@RestController
public class DlitheController {
	
	@Autowired
	TournamentService tservice;
	@Autowired
	AthleteService aservice;
}
