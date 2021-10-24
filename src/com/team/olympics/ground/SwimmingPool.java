package com.team.olympics.ground;

/**
 * @author Charles Gao
 * @description the swimming pool ground
 * @date 2021/10/16
 */
public class SwimmingPool extends GameGround{

    private static SwimmingPool instance = new SwimmingPool();
    public static SwimmingPool getInstance()
    {
        return instance;
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void setType() {
        this.setType("Swimming Pool");
    }
}
