package repository;

import bo.Battle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BattleRepository extends JpaRepository<Battle, UUID> {
}
