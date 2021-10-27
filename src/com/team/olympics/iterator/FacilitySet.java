package com.team.olympics.iterator;


import com.team.olympics.facility.Facility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yifan Li
 * @description: Expression interface
 * @create: 2021/10/26
 **/
public class FacilitySet implements ElementSet {

    private List<Facility> facilities = null;


    public FacilitySet() {
        facilities = new ArrayList<Facility>();
    }

    //Add an element
    @Override
    public void add(Facility facility) {
        facilities.add(facility);
    }


    //Remove an element
    @Override
    public void remove(Facility facility) {
        facilities.remove(facility);
    }


    //Returns an Iterator that copies a private member List
    @Override
    public Iterator getIterator() {
        return new FacilityStorageIterator(facilities);
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "class FacilitySet implements ElementSet"+
                "FacilitySet{" +
                "facilities=" + facilities +
                '}';
    }
}
