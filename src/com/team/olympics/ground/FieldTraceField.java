package com.team.olympics.ground;


/**
 * @author Charles Gao
 * @description the field trace field
 * @date 2021/10/16
 */
public class FieldTraceField extends GameGround{

    private static FieldTraceField instance = new FieldTraceField();
    public static FieldTraceField getInstance()
    {
        return instance;
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void setType() {
        this.setType("Field Trace");
    }
}
