package com.team.olympics.ground;

/**
 * @author Charles Gao
 * @description the base class for all game grounds
 * @date 2021/10/16
 */
public abstract class GameGround {
    private String type;
    private String location;
    private double size;
    private int due;

    // getters&setters
    public String getType() {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }
    // this is an abstract method which is implemented in the sub-classes
    public abstract void setType();

    public void show()
    {
        System.out.println("Type: "+ type);
        System.out.println("Location: "+location);
        System.out.println("Size: "+size+" square meters");
        System.out.println("Construction will complete in "+ due + " days");
    }
}
