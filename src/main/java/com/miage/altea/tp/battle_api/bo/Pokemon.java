package com.miage.altea.tp.battle_api.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {

    public int id;
    public PokemonType pokemonType;
    public int level;
    public float maxHp;
    public float attack;
    public float defense;
    public float speed;
    public float hp;
    public boolean ko;
    public boolean alive;

    public Pokemon() {
    }

    public Pokemon(int id) {
        this.id = id;
    }

}
