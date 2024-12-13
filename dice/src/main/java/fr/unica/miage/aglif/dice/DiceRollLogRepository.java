package fr.unica.miage.aglif.dice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRollLogRepository extends JpaRepository<DiceRollLog, Long> {
}