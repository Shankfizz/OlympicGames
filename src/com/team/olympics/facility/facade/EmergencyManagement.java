package com.team.olympics.facility.facade;

import com.team.olympics.facility.emergencyexit.EmergencyExit;
import com.team.olympics.ground.GameGround;
import com.team.olympics.person.staff.safeguardstaff.SafeguardStaff;

/**
 * @author Hejing Cai
 * @description the management of emergency
 * @date 2021/10/22
 */
public class EmergencyManagement {

    GameGround emergencyGround ;

    public EmergencyManagement(GameGround emergencyGround) {
        this.emergencyGround = emergencyGround;
    }

    public void broadcastEmergencyMessage(){
        System.out.println("正在进行广播准备...");
        emergencyGround.getBroadcast().setMessageType("emergency");
        emergencyGround.getBroadcast().startBroadcast();
        System.out.println();

    }
    public void checkEmergencyExits(){
        System.out.println("正在检查安全通道情况...");
        for(EmergencyExit emergencyExit :emergencyGround.getEmergencyExits()){
            emergencyExit.check();
        }
        System.out.println();
    }
    public void setEmergencyLight(){
        System.out.println("正在进行灯光调整...");
        emergencyGround.getLights().setType("emergency");
        emergencyGround.getLights().changeLight();
        System.out.println();

    }
    public void guideCrowds(){
        System.out.println("正在安排安保人员就位...");
        for(SafeguardStaff safeguardStaff :emergencyGround.getSafeguardStaffs()){
            safeguardStaff.guideCrowd();
        }
        System.out.println();

    }

}