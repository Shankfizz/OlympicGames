package com.team.olympics.game.gender;

public class Men implements Gender{
    // implementation of Gender interface(Men)
    @Override
    public void show(String game) {
        System.out.println(game+": Men");
    }

    @Override
    public String getGender() {
        return "Man";
    }
}
