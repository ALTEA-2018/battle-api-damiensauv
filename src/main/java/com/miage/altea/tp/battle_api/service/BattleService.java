package com.miage.altea.tp.battle_api.service;

import com.miage.altea.tp.battle_api.bo.Battle;
import com.miage.altea.tp.battle_api.bo.Trainer;
import com.miage.altea.tp.battle_api.repository.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class BattleService {

    private BattleRepository battleRepository;

    private TrainerService trainerService;

    @Autowired
    public void setTrainerService(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    public BattleService(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    public List<Battle> getAll() {

        return this.battleRepository.findAll();
    }

    public Battle getByUUID(UUID uuid) {
        return this.battleRepository.findById(uuid).orElseThrow(() -> new NoSuchElementException("battle with uuid " + uuid + " not found"));
    }

    public UUID createBattle(final String trainer, final String opponent) {
        Battle battle = new Battle();
        battle.setUuid(UUID.randomUUID());

        Trainer sacha = this.trainerService.getTrainer(trainer);
        Trainer regis = this.trainerService.getTrainer(trainer);

        battle.setTrainer(sacha);
        battle.setOpponent(regis);


        return battle.getUuid();
    }

    public void attack(UUID uuid, String trainer) {


    }
}
