package com.team.olympics.game.pingpong;

import com.team.olympics.game.Game;
import com.team.olympics.game.gender.Gender;

/**
 * @author Charles Gao
 * @description the ping-pong abstract class
 * @date 2021/10/15
 */
public abstract class PingPongGame extends Game {
    // ctor
    public PingPongGame(Gender gender)
    {
        super(gender);
    }
    // the method actually invokes the show() in Gender interface
    public abstract void show();

}
