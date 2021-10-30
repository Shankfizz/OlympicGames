package com.team.olympics.site;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;

public abstract class Site {

    /**
     * location of this site
     */
    protected String location;

    /**
     * cost of this site, per year
     */
    protected double cost;

    /**
     * area of this site
     */
    protected double area;


    public Site(String location, double cost, double area) {
        this.location = location;
        this.cost = cost;
        this.area = area;
    }


    public Site() {
        this("Default Location", 10000, 100);
    }

    public Site(double cost) {
        this("Default Location", cost, 100);
    }


    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /**
     * @return location of this site
     */
    public String getLocation() {
        return this.location;
    }



    /**
     * @return area of this site
     */
    public double getArea() {
        return this.area;
    }

    /**
     * the site may be expanded or reduced
     *
     * @param newArea the new area of this site
     */
    public void setArea(double newArea) {
        this.area = newArea;
    }

    /**
     * print a line to show that the scene is cleaned up
     */
    public void getCleanUp() {
        System.out.println("The " + toString() + " is cleaned up.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(SiteMaintenanceStaff worker);

}
