package com.team.olympics.watcher;

import com.team.olympics.game.fieldtrace.RaceGame;

public class GameWatcher {
    private String name;
    private RaceGame game;

    public GameWatcher(String name, RaceGame game) {
        this.name = name;
        this.game = game;
        this.game.attach(this);
    }
    public void update()
    {
        System.out.println(this.name+" is watching:");
        this.game.show();
        System.out.println("State: "+this.game.getState().toString());
        System.out.println();
    }

}
