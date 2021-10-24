package com.team.olympics.person.staff.safeguardstaff;

import com.team.olympics.person.staff.Staff;

public class SafeguardStaff extends Staff {

    private int staffid;

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public void guideCrowd(){
        System.out.println(staffid+"号安保人员已到岗，开始进行引导疏散人群工作。");
    }
}
