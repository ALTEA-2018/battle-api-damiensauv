package controller;


import bo.Battle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BattleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/battles")
public class BattleController {

    @Autowired
    private BattleService battleService;

    @PostMapping
    public UUID battle(@PathVariable(name = "trainer") String trainer, @PathVariable(name = "opponent") String opponent) {
        return this.battleService.createBattle(trainer, opponent);
    }

    @GetMapping
    public List<Battle> getAll() {
        return this.battleService.getAll();
    }

    @GetMapping("/{uuid}")
    public Battle getId(@PathVariable(name = "uuid") UUID uuid) {
        return this.battleService.getByUUID(uuid);
    }

    @PostMapping("/{uuid}/{trainerName}/attack")
    public Battle attack(@PathVariable(name = "uuid") UUID uuid, @PathVariable(name = "trainer") String trainer) {

        this.battleService.attack(uuid, trainer);

        return null;
    }


}
