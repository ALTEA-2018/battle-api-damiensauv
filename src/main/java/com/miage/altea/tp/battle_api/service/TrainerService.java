package com.miage.altea.tp.battle_api.service;

import com.miage.altea.tp.battle_api.bo.Trainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrainerService {

    private RestTemplate restTemplate;

    @Value("${trainer.service.url}")
    private String url;

    public void setUrl(String url) {
        this.url = url;

    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Trainer getTrainer(String name) {
        Trainer trainer = this.restTemplate.getForObject(this.url, Trainer.class, name);


        return trainer;
    }

}
