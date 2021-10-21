package com.team.olympics.game;

import com.team.olympics.game.gender.Gender;

/**
 * @author Charles Gao
 * @description the base class for all games
 * @date 2021/10/17
 */
public abstract class Game {
    private Gender gender;
    // ctor
    public Game(Gender gender)
    {
        this.gender = gender;
    }

    // the getter&setter
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public abstract void show();
}
