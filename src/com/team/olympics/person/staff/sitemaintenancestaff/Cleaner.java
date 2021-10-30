package com.team.olympics.person.staff.sitemaintenancestaff;

import com.team.olympics.person.staff.Staff;

public class Cleaner extends Staff implements SiteMaintenanceStaff {

    public String identity = "worker";

    public Cleaner(String name, int age, Sex sex) {
        super(name, age, sex);
    }
}
