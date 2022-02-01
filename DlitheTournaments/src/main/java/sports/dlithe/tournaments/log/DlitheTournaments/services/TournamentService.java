package sports.dlithe.tournaments.log.DlitheTournaments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sports.dlithe.tournaments.log.DlitheTournaments.repository.TournamnetRepository;

@Service
public class TournamentService {
	
	@Autowired
	TournamnetRepository trepo;
}
