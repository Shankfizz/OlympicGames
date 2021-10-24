package test.moduletest;

import com.team.olympics.ground.FieldTraceField;
import com.team.olympics.ground.GameGround;
import com.team.olympics.ground.SoccerCourt;
import com.team.olympics.ground.SwimmingPool;
import com.team.olympics.organizingcommittee.OrganizingCommittee;
import com.team.olympics.facility.facade.EmergencyManagement;


import java.util.Scanner;

/**
 * @author Hejing Cai
 * @description the test class for facade pattern
 * @date 2021/10/24
 */
public class FacadeTest {

    public static void facadeTest(GameGround emergencyGround){

        System.out.println("--------------------------对场馆进行初始化--------------------------------");
        emergencyGround.init();
        System.out.println("每个场馆有5个安保人员，2个紧急出口。");
        System.out.println("以下为发生紧急状况时，组委会将采取的措施。");
        System.out.println("");

        OrganizingCommittee organizingCommittee = new OrganizingCommittee();
        EmergencyManagement emergencyManagement = new EmergencyManagement(emergencyGround);
        organizingCommittee.setEmergencyManagement(emergencyManagement);
        organizingCommittee.broadcasetEmergencyMessage();
        organizingCommittee.setEmergencyLight();
        organizingCommittee.checkEmergencyExits();
        organizingCommittee.guideCrowds();


    }
    public static void main(String[] args)
    {
        System.out.println("--------------------------- Facade ---------------------------------");
        System.out.println("OrganizingCommittee(): Organizing committee of the Olympic Games");
        System.out.println("EmergencyManagement(): Management of emergency cases");
        System.out.println("broadcasetEmergencyMessage(): Broadcast emergency message in emergency situation");
        System.out.println("setEmergencyLight(): Change the lights in the game ground in emergency situation");
        System.out.println("checkEmergencyExits(): Check the emergency exits in emergency situation");
        System.out.println("guideCrowds(): Guide the crowds to exit in emergency situation");
        System.out.println("----------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true)
        {
            System.out.println("请选择发生紧急状况的场馆[1:FieldTrace | 2:SoccerCourt | 3:SwimmingPool] | 4:退出");

            i = scanner.nextInt();
        if(i == 1)
            facadeTest(FieldTraceField.getInstance());
        else if(i == 2)
            facadeTest(SoccerCourt.getInstance());
        else if(i == 3)
            facadeTest(SwimmingPool.getInstance());
        else if(i == 4)
            break;
        else
            System.out.print("输入的数字无效，");}
        System.out.println("-------- End of Facade Pattern testing ---------");


    }
}
