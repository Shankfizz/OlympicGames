package com.team.olympics.person.staff;

import com.team.olympics.person.Person;

public class Staff extends Person {

    private String workType;
    protected String workGround;

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkGround() {
        return workGround;
    }

    public void setWorkGround(String workGround) {
        this.workGround = workGround;
    }
}
