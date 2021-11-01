package com.team.olympics.game.gender;

public class Women implements Gender{
    // implementation of Gender interface(Women)
    @Override
    public void show(String game) {
        System.out.println(game+": Women");
    }

    @Override
    public String getGender() {
        return "Woman";
    }
}
