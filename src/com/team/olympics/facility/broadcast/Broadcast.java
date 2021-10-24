package com.team.olympics.facility.broadcast;

import com.team.olympics.facility.Facility;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Broadcast extends Facility {
    private String messageType;
    private String message;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void startBroadcast(){
        if(messageType=="emergency"){
            setMessage("紧急广播：目前场馆内出现紧急状况，请尽快在灯光引导下从离您最近的安全通道撤离，如遇困难请及时向场馆内的安保人员寻求帮助，谢谢配合！");
            System.out.println(message);
        }

    }
}
