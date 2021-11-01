package test.moduletest;

import com.team.olympics.organizingcommittee.OrganizingCommittee;
import com.team.olympics.player.SportPlayer;

import java.util.Scanner;

public class StatusTest {
    public static void main(String[] args){
        System.out.println("--------------------------- Status ---------------------------------");

        test();
        System.out.println("------------------------- Status end---------------------------------");
    }

    public static void test()
    {
        System.out.println("正在初始化运动员");
        SportPlayer newPlayer = new SportPlayer();

        while (true) {
            System.out.println("0:exit else:continue");
            if(getNum()==0)
                break;
            System.out.println("请输入需要更改的状态值(-99~99):");
            newPlayer.setStatus(getNum());
        }
    }

    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();    //读取整型输入
        return age;
    }
}
