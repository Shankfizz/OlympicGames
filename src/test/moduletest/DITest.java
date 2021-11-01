package test.moduletest;

import com.team.olympics.di.SetterInjection;
import com.team.olympics.player.DIPlayer;

import java.util.List;

/**
 * @author Charles Gao
 * @description the test class for Dependency Injection(DI) Pattern
 * @date 2021/10/27
 */
public class DITest {
    public static void diTest()
    {
        List<DIPlayer> players = new SetterInjection("src/com/team/olympics/di/PlayerInfo.xml").getAllPlayers();
        for(int i = players.size()-1;i>=0;i--)
        {
            System.out.println("Player "+(players.size()-i));
            players.get(i).showDI();
        }
        System.out.println("---------- End of Dependency Injection Pattern testing ---------------");
    }
    public static void main(String[] args)
    {
        System.out.println("-------------------------- Dependency Injection ----------------------");
        System.out.println("SetterInjection(): The class for setter injection(one method of DI, mainly get data from XML files)");
        System.out.println("resolveXML(): resolving the XML file and set objects via reflection feature");
        System.out.println("----------------------------------------------------------------------");
        diTest();
    }
}
