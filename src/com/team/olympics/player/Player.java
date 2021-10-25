package com.team.olympics.player;

/**
 * @author Charles Gao
 * @description the player class(shall be abstract and extended in the future) temporarily used in IoC Pattern
 * @date 2021/10/25
 */
public class Player {
    private String name;
    private String playGame;

    public Player(String name, String playGame) {
        this.name = name;
        this.playGame = playGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayGame() {
        return playGame;
    }

    public void setPlayGame(String playGame) {
        this.playGame = playGame;
    }
}
