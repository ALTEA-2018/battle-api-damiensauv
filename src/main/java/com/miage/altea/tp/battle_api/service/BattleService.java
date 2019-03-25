package com.miage.altea.tp.battle_api.service;

import com.miage.altea.tp.battle_api.bo.Battle;
import org.springframework.stereotype.Service;
import com.miage.altea.tp.battle_api.repository.BattleRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class BattleService {

    private BattleRepository battleRepository;

    public BattleService(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    public List<Battle> getAll() {

        return this.battleRepository.findAll();
    }

    public Battle getByUUID(UUID uuid) {
        return this.battleRepository.findById(uuid).orElseThrow(() -> new NoSuchElementException("battle with uuid " + uuid + " not found"));
    }

    public UUID createBattle(String trainer, String opponent) {
        Battle battle = new Battle();
        battle.setUuid(UUID.randomUUID());
        /**
         *  TODO recup les 2 trainer
         *  insert
         */

        return null;
    }

    public void attack(UUID uuid, String trainer) {
    }
}
