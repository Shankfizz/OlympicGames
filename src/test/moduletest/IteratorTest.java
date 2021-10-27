package test.moduletest;


import com.team.olympics.facility.Facility;
import com.team.olympics.iterator.FacilitySet;
import com.team.olympics.iterator.Iterator;

/**
 * @author Yifan Li
 * @description the test class for iterator pattern
 * @date 2021/10/26
 */
public class IteratorTest {


//    public class Facility {
//
//        protected String name;
//        protected int count;
//        protected String location;

        // iterator test method
    public static  void iteratorTest(){
        System.out.println("—————————————-------------------------------------———— Test[Iterator]Pattern —————————————-------------------------------------————");
        System.out.println("FacilitySet : getIterator() : Gets an iterator for an item created from the item's aggregation class.");
        System.out.println("Iterator : first() : Gets the first reasonable element.");
        System.out.println("Iterator : next() : Gets the next reasonable element.");
        System.out.println("Iterator : hasNext() : Determine if there is the next logical element.");
        System.out.println("");

    }


    public static void main(String[] args)
    {
        FacilitySet facilitySet = new FacilitySet();


        iteratorTest();


        //init elements
        Facility camera = new Facility();
        camera.setName("camera");
        camera.setCount(10);
        camera.setLocation("OrganizingCommittee");

        Facility light = new Facility();
        light.setName("light");
        light.setCount(1);
        light.setLocation("Stage");

        Facility monitor = new Facility();
        monitor.setCount(9);
        monitor.setName("monitor");
        monitor.setLocation("Hall");


        facilitySet.add(camera);
        facilitySet.add(light);
        facilitySet.add(monitor);

        Iterator facilityStorageIterator = facilitySet.getIterator();
        Facility facility = facilityStorageIterator.first();

        while(true)
        {
            System.out.println("Device Name："+facility.getName()+
                    ",Amount："+facility.getCount()+
                    ",Arrangement Place："+facility.getLocation());

            if(facilityStorageIterator.hasNext())
            {
                System.out.println("Iterator can still get next element!");
                facility = facilityStorageIterator.next();
            }
            else
            {
                System.out.println("Iterator has reached to the end!");
                break;
            }

        }

        System.out.println("Iterator设计模式测试完毕！");
    }
}
