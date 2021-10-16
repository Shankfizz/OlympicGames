package com.team.olympics.builder;

import com.team.olympics.ground.GameGround;
import com.team.olympics.ground.SoccerCourt;

public class SoccerCourtBuilder implements Builder {
    private GameGround ground = new SoccerCourt();
    @Override
    public void buildType() {
        ground.setType();
    }

    @Override
    public void buildLocation(String location) {
        ground.setLocation(location);
    }

    @Override
    public void buildSize(double size) {
        ground.setSize(size);
    }

    @Override
    public void buildDue(int due) {
        ground.setDue(due);
    }

    @Override
    public GameGround build() {
        return ground;
    }
}
