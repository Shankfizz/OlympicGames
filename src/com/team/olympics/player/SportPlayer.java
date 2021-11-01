package com.team.olympics.player;
import com.team.olympics.Status.*;

/**
 * @author Charles Gao
 * @description the player class(shall be abstract and extended in the future) temporarily used in IoC Pattern
 * @date 2021/10/25
 */
public class SportPlayer extends Player{
    private String name;
    private String playGame;
    private String nation;
    private Status currentStatus,DieStatus,WeakStatus,TiredStatus,CommonStatus,StrongStatus;
    private int StatusNum;

    public SportPlayer(){
        this.DieStatus = new DieStatus();
        this.WeakStatus = new WeakStatus();
        this.TiredStatus = new TiredStatus();
        this.CommonStatus = new CommonStatus();
        this.StrongStatus = new StrongStatus();
        this.StatusNum = 75;
        this.updateStatus();
    }
    public SportPlayer(String name, String playGame,String nation) {
        this.DieStatus = new DieStatus();
        this.WeakStatus = new WeakStatus();
        this.TiredStatus = new TiredStatus();
        this.CommonStatus = new CommonStatus();
        this.StrongStatus = new StrongStatus();
        this.StatusNum = 75;
        this.updateStatus();

        this.name = name;
        this.playGame = playGame;
        this.nation = nation;
    }

    public void setStatus(int x)
    {
        this.StatusNum += x;
        if(this.StatusNum>=100){this.StatusNum = 99;}
        else if(this.StatusNum<0){this.StatusNum=0;}
        this.updateStatus();
    }

    private void updateStatus()
    {
        if(this.StatusNum==0){this.currentStatus=this.DieStatus;}
        else if(this.StatusNum<25){this.currentStatus = this.WeakStatus;}
        else if(this.StatusNum<50){this.currentStatus = this.TiredStatus;}
        else if(this.StatusNum<75){this.currentStatus = this.CommonStatus;}
        else if(this.StatusNum<99){this.currentStatus = this.StrongStatus;}

        this.display();
    }
    private void display(){this.currentStatus.showStatus(this.StatusNum);}
}