package sports.dlithe.tournaments.log.DlitheTournaments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sports.dlithe.tournaments.log.DlitheTournaments.enity.Tournament;
import sports.dlithe.tournaments.log.DlitheTournaments.repository.TournamnetRepository;

@Service
public class TournamentService {
	
	@Autowired
	TournamnetRepository trepo;
	
	public String newOne(Tournament tournament) {
		
		return trepo.save(tournament).getName()+ " has added as a upcoming event";
	}
}
