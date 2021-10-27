package com.team.olympics.iterator;


import com.team.olympics.facility.Facility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yifan Li
 * @description: Expression interface
 * @create: 2021/10/26
 **/
public class FacilityStorageIterator implements Iterator {

    private List<Facility> facilities = null;
    private int index = -1;
    private float dead_line = 0;



    //construction with parameters
    public FacilityStorageIterator(List<Facility> facilities) {
        this.facilities = facilities;
    }

    // construction without parameters
    public FacilityStorageIterator() {
        facilities = new ArrayList<>();
    }


    //Point to the first element, (the first element that can be simply modified to satisfy the condition, the same below)
    @Override
    public Facility first() {
        index = 0;
        return  facilities.get(index);
    }


    //Point to the next element
    @Override
    public Facility next() {
        if(this.hasNext())
        {
            index++;
            return facilities.get(index);
        }
        else
        {
            System.out.println("已走至迭代末尾！");
            return null;
        }
    }


    //Determine if there exists the next element
    @Override
    public boolean hasNext() {
        if(index<facilities.size()-1)
        {
            return true;
        }
        return false;
    }


    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public float getDead_line() {
        return dead_line;
    }

    public void setDead_line(float dead_line) {
        this.dead_line = dead_line;
    }

    @Override
    public String toString() {
        return "FacilityStorageIterator{" +
                "facilities=" + facilities +
                ", index=" + index +
                ", dead_line=" + dead_line +
                '}';
    }
}
