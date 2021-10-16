package com.team.olympics.builder;

import com.team.olympics.ground.FieldTrace;
import com.team.olympics.ground.GameGround;

public class FieldTraceBuilder implements Builder{
    private GameGround ground = new FieldTrace();
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
