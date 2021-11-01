package com.team.olympics.iterator;


import com.team.olympics.facility.Facility;

/**
 * @author Yifan Li
 * @description Expression interface
 * @create 2021/10/26
 **/
public interface Iterator {

    Facility first();

    Facility next();

    boolean hasNext();
}
