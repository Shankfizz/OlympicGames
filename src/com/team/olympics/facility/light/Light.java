package com.team.olympics.facility.light;

import com.team.olympics.facility.Facility;

public class Light extends Facility {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void changeLight(){
        if(type.equals("emergency")){
            System.out.println("场馆内灯光已调整为紧急情况引导指示灯。");
        }
    }
}
