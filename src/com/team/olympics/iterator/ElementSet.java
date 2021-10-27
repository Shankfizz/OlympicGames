package com.team.olympics.iterator;

import com.team.olympics.facility.Facility;


/**
 * @author: Yifan Li
 * @description: The interface claims the method getIterator(), the class which implements this interface can be traversed.
 * @create: 2021/10/26
 **/
public interface ElementSet {

    public void add(Facility facility);

    public void remove(Facility facility);

    public Iterator getIterator();
}
