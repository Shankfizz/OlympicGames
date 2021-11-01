package com.team.olympics.template;

/***
 * @author syq
 * @description base class Race
 */
public abstract class Race {
    //base class

    protected int meter;
    public abstract int Ready();//the responsible for implementation shoulders on th subclass
    public abstract int Run();
    public abstract int End();
    public final void Action(){//template method :fixed algorithm framework
        int r=Ready();
        while(r!=1){
            r=Ready();
        }
        Run();
        End();
    }
}
