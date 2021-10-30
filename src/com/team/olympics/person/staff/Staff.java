package com.team.olympics.person.staff;

import com.team.olympics.person.Person;

import java.util.UUID;

public abstract class Staff extends Person {

    public String identity = "staff";

    /**
     * staff ID number, each is unique
     */
    protected String id;

    private String workType;
    protected String workGround;

    public Staff(String name, int age, Sex sex) {
        super(name, age, sex);
        this.id = allocateId();
    }

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

    /**
     * @return allocate a unique UUID for every staff
     */
    protected static String allocateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("[a-zA-Z]|-", "").substring(3, 11);
    }

    @Override
    public String toString() {
        return "abstract class Staff extends Person";
    }
}
