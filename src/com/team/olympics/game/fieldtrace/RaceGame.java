package com.team.olympics.game.fieldtrace;

import com.team.olympics.game.Game;
import com.team.olympics.game.GameState;
import com.team.olympics.game.gender.Gender;
import com.team.olympics.audience.Audience;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Charles Gao
 * @description the class for race game(temporarily for Observer only)
 * @date 2021/10/18
 */
public class RaceGame extends Game {
    private GameState state;
    private String gameType;
    private List<Audience> audiences = new ArrayList<>();

    /**
     * ctor of the class
     * @param gender the gender type of the game
     * @param gameType the type of the game
     */
    public RaceGame(Gender gender, String gameType) {
        super(gender);
        this.state = GameState.NOT_STARTED;
        this.gameType = gameType;
    }

    // state getter
    public GameState getState() {
        return state;
    }

    /**
     * switch the state
     */
    public void nextState()
    {
        switch (this.state)
        {
            case NOT_STARTED:
            {
                this.state = GameState.ON_PROCESS;
                break;
            }
            case ON_PROCESS:
            {
                this.state = GameState.FINISHED;
                break;

            }
            case FINISHED:
            {
                System.out.println("The game has already finished!");
                return;
            }
        }
        // notify all observers
        notifyAllAudiences();
    }

    /**
     * attach observers to the observer list
     * @param audience the audience
     */
    public void attach(Audience audience)
    {
        this.audiences.add(audience);
    }

    /**
     * update the observers
     */
    public void notifyAllAudiences()
    {
        for(Audience audience: audiences)
        {
            audience.update();
        }
    }

    @Override
    public void show() {
        this.getGender().show(gameType);
    }
}
