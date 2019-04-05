package com.miage.altea.tp.battle_api.service;

import com.miage.altea.tp.battle_api.bo.PokemonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonTypeServiceImpl {
    private RestTemplate restTemplate;
    private String url;


    public PokemonType getPokemonByTypeId(Integer id) {
        PokemonType pokemonType = this.restTemplate.getForObject(this.url + "/pokemon-types/" + id, PokemonType.class);

        if (pokemonType != null) {
            return pokemonType;
        } else {
            throw new NullPointerException();
        }
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${pokemonType.service.url}")
    public void setPokemonTypeServiceUrl(String pokemonServiceUrl) {
        this.url = pokemonServiceUrl;
    }
}
