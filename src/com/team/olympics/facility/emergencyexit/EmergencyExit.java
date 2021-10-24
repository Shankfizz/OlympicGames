package com.team.olympics.facility.emergencyexit;

import com.team.olympics.facility.Facility;

public class EmergencyExit extends Facility {

    private String location;
    private int exitid;

    public int getExitid() {
        return exitid;
    }

    public void setExitid(int exitid) {
        this.exitid = exitid;
    }

    public void check(){
        System.out.println(exitid+"号安全通道已确认可通行");

    }
}
