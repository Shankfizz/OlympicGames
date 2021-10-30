package com.team.olympics.ground;

import com.team.olympics.facility.broadcast.Broadcast;
import com.team.olympics.facility.emergencyexit.EmergencyExit;
import com.team.olympics.facility.light.Light;
import com.team.olympics.person.staff.safeguardstaff.SafeguardStaff;

import java.util.ArrayList;
import java.util.List;

import static com.team.olympics.person.Person.Sex.FEMALE;
import static com.team.olympics.person.Person.Sex.MALE;

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
    private List<SafeguardStaff> safeguardStaffs;
    private Light lights;
    private Broadcast broadcast;
    private List<EmergencyExit> emergencyExits;


    public void init(){
        broadcast = new Broadcast();
        lights = new Light();
        safeguardStaffs = new ArrayList<>();
        SafeguardStaff safeguardStaff1 = new SafeguardStaff("Alex",20,MALE);
        safeguardStaff1.setStaffid(1);
        SafeguardStaff safeguardStaff2 = new SafeguardStaff("Bob",21,MALE);
        safeguardStaff2.setStaffid(2);
        SafeguardStaff safeguardStaff3 = new SafeguardStaff("Cindy",22,FEMALE);
        safeguardStaff3.setStaffid(3);
        SafeguardStaff safeguardStaff4 = new SafeguardStaff("David",23,MALE);
        safeguardStaff4.setStaffid(4);
        SafeguardStaff safeguardStaff5 = new SafeguardStaff("Eric",24,MALE);
        safeguardStaff5.setStaffid(5);
        safeguardStaffs.add(safeguardStaff1);
        safeguardStaffs.add(safeguardStaff2);
        safeguardStaffs.add(safeguardStaff3);
        safeguardStaffs.add(safeguardStaff4);
        safeguardStaffs.add(safeguardStaff5);

        emergencyExits = new ArrayList<>();
        EmergencyExit emergencyExit1 = new EmergencyExit();
        emergencyExit1.setExitid(1);
        EmergencyExit emergencyExit2 = new EmergencyExit();
        emergencyExit2.setExitid(2);
        emergencyExits.add(emergencyExit1);
        emergencyExits.add(emergencyExit2);
    }


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

    public List<SafeguardStaff> getSafeguardStaffs() {
        return safeguardStaffs;
    }

    public void setSafeguardStaffs(List<SafeguardStaff> safeguardStaffs) {
        this.safeguardStaffs = safeguardStaffs;
    }

    public Light getLights() {
        return lights;
    }

    public void setLights(Light lights) {
        this.lights = lights;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public List<EmergencyExit> getEmergencyExits() {
        return emergencyExits;
    }

    public void setEmergencyExits(List<EmergencyExit> emergencyExits) {
        this.emergencyExits = emergencyExits;
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
