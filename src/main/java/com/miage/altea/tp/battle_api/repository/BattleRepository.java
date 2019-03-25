package com.miage.altea.tp.battle_api.repository;

import com.miage.altea.tp.battle_api.bo.Battle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BattleRepository extends JpaRepository<Battle, UUID> {
}
