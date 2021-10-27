package com.team.olympics.player;

/**
 * @author Charles Gao
 * @description the player class(shall be abstract and extended in the future) temporarily used in IoC Pattern
 * @date 2021/10/25
 */
public class Player {
    private String name;
    private String gender;
    private String nation;
    private String playGame;

    public Player(){}
    public Player(String name, String gender,String nation,String playGame) {
        this.name = name;
        this.gender=gender;
        this.nation = nation;
        this.playGame = playGame;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlayGame() {
        return playGame;
    }

    public void setPlayGame(String playGame) {
        this.playGame = playGame;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }


    public void showDI()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Nation: "+this.nation);
        System.out.println("Playing: "+this.playGame);
        System.out.println();
    }
}
