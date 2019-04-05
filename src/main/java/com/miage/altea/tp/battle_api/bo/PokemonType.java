package com.miage.altea.tp.battle_api.bo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PokemonType {

    private int id;
    private int baseExperience;
    private int height;
    private String name;
    private Sprites sprites;
    private Stats stats;
    private int weight;
    private List<String> types;

    public PokemonType() {
    }

    @Override
    public String toString() {
        return "PokemonType{" +
                "id=" + id +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", sprites=" + sprites +
                ", stats=" + stats +
                ", weight=" + weight +
                ", types=" + types +
                '}';
    }
}
