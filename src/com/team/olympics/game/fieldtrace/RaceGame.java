package com.team.olympics.game.fieldtrace;

import com.team.olympics.game.Game;
import com.team.olympics.game.GameState;
import com.team.olympics.game.gender.Gender;
import com.team.olympics.watcher.GameWatcher;

import java.util.ArrayList;
import java.util.List;

public class RaceGame extends Game {
    private GameState state;
    private String gameType;
    private List<GameWatcher> watchers = new ArrayList<>();
    public RaceGame(Gender gender, String gameType) {
        super(gender);
        this.state = GameState.NOT_STARTED;
        this.gameType = gameType;
    }

    public GameState getState() {
        return state;
    }

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
        notifyAllWatchers();
    }

    public void attach(GameWatcher watcher)
    {
        this.watchers.add(watcher);
    }

    public void notifyAllWatchers()
    {
        for(GameWatcher watcher:watchers)
        {
            watcher.update();
        }
    }
    @Override
    public void show() {
        this.getGender().show(gameType);
    }
}
