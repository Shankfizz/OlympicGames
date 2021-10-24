package com.team.olympics.ground;

/**
 * @author Charles Gao
 * @description the soccer court ground
 * @date 2021/10/16
 */
public class SoccerCourt extends GameGround{

    private static SoccerCourt instance = new SoccerCourt();
    public static SoccerCourt getInstance()
    {
        return instance;
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void setType() {
        this.setType("Soccer Court");
    }
}
