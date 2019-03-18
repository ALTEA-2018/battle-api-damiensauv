package bo;

import java.util.UUID;


public class Battle {

    private UUID uuid;

    private Trainer trainer;

    private Trainer opponent;

    private Boolean nextTurn;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Trainer getOpponent() {
        return opponent;
    }

    public void setOpponent(Trainer opponent) {
        this.opponent = opponent;
    }

    public Boolean getNextTurn() {
        return nextTurn;
    }

    public void setNextTurn(Boolean nextTurn) {
        this.nextTurn = nextTurn;
    }
}
