package com.team.olympics.organizingcommittee;

import com.team.olympics.facility.facade.EmergencyManagement;

public class OrganizingCommittee {

    private static OrganizingCommittee organizingCommittee;


    public static OrganizingCommittee getInstance(){
        if(organizingCommittee == null){
            System.out.println("This is the first time OrganizingCommittee is created");
            organizingCommittee = new OrganizingCommittee();
        }
        else{
            System.out.println("The object has been created！");
        }
        return organizingCommittee;
    }

    private EmergencyManagement emergencyManagement;
    public void setEmergencyManagement(EmergencyManagement e){
        emergencyManagement = e;

    }
    public void broadcastEmergencyMessage(){
        emergencyManagement.broadcastEmergencyMessage();
    }
    public void checkEmergencyExits(){
        emergencyManagement.checkEmergencyExits();
    }
    public void setEmergencyLight(){
        emergencyManagement.setEmergencyLight();
    }
    public void guideCrowds(){
        emergencyManagement.guideCrowds();
    }
}
