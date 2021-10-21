package com.team.olympics.builder;

import com.team.olympics.ground.GameGround;
/**
 * @author Charles Gao
 * @description Builder interface
 * @date 2021/10/16
 */
public interface Builder {
    void buildType();  // set the type of the building
    void buildLocation(String location);  // set the location
    void buildSize(double size);  // set the size(area) of the building
    void buildDue(int due);  // set the due day of the completion of building
    GameGround build();  // build all things
}
