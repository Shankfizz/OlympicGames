package com.team.olympics.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/***
 * @author syq
 * @description It describes the flow of two hundred race
 */
public class RaceTwoHundred extends Race{
    private List<Double> timeArray= new ArrayList<>();
    public RaceTwoHundred(){
        this.meter = 200;
    }
    @Override
    public int Ready() {
        System.out.println("This is "+meter+" race");
        System.out.println("On your Mark!");
        PauseRandomTime();
        System.out.println("Set!");
        PauseRandomTime();
        System.out.println("Go!");
        return 1;
    }

    @Override
    public int Run() {
        PauseRandomTime();
        for(int i=0;i<9;i++){
            timeArray.add((int)(Math.random()*900)/100.0+20);
        }

        return 1;
    }

    @Override
    public int End() {
        PauseRandomTime();
        int i=1;
        for (Double aDouble : timeArray) {
            System.out.println("Score of runner" + i++ + ":" + aDouble);
        }
        timeArray.sort(Comparator.naturalOrder());
        System.out.println("first score:"+timeArray.get(0));
        System.out.println("second score:"+timeArray.get(1));
        System.out.println("third score:"+timeArray.get(2));
        System.out.println("That is over!");
        return 1;
    }
    public static void PauseRandomTime(){
        try {
            Thread.sleep( (int)(Math.random()*3000));
        } catch (Exception e){
            System.exit( 0 ); //退出程序
        }
    }
}
