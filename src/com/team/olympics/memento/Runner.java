package com.team.olympics.memento;

/***
 * @author syq
 * @description Runner class includes time and name,and provide method for createMemento and restoreMemento
 */
public class Runner {
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    private double time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Runner(double time,String name){
        this.time=time;
        this.name=name;
    }
    public Memento createMemento(){//创建备忘录
        return new Memento(time,name);
    }
    public void restoreMemento(Memento memento){//读取备忘录
        this.time=memento.getTime();
        this.name=memento.getName();
    }
    public void Show(){
        System.out.println("Runner name:"+name);
        System.out.println("Runner score:"+time);
    }
}
