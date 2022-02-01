package sports.dlithe.tournaments.log.DlitheTournaments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sports.dlithe.tournaments.log.DlitheTournaments.enity.Tournament;

@Repository
public interface TournamnetRepository extends JpaRepository<Tournament, Integer> {

}
