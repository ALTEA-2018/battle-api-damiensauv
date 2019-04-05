package com.miage.altea.tp.battle_api.bo;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Battle {

    private UUID uuid;
    private Trainer trainer;
    private Trainer opponent;
    private Boolean nextTurn;
    public State state;

}
