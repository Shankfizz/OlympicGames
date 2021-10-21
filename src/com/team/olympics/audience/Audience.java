package com.team.olympics.audience;

import com.team.olympics.game.fieldtrace.RaceGame;

/**
 * @author Charles Gao
 * @description the game watcher class
 * @date 2021/10/18
 */
public class Audience {
    private String name;
    private RaceGame game;
    // ctor of the class
    public Audience(String name, RaceGame game) {
        this.name = name;
        this.game = game;
        this.game.attach(this);
    }
    // show the game and the current state of the game
    public void update()
    {
        System.out.println(this.name+" is watching:");
        this.game.show();
        System.out.println("State: "+this.game.getState().toString());
        System.out.println();
    }

}
