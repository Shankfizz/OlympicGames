package test.moduletest;

import com.team.olympics.builder.*;
import com.team.olympics.ground.GameGround;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Charles Gao
 * @description the test class for bridge pattern
 * @date 2021/10/15
 */
public class BuilderTest {
    public static void builderTest()
    {
        Builder builder = null;
        BuildDirector buildDirector;
        boolean testing = true;
        while(testing)
        {
            boolean validType = false;
            try
            {
                System.out.println("Please choose the type of the ground you want to build:[1:Field Trace, 2: Soccer Court, 3: Swimming Pool, 0:Quit]");
                Scanner sc = new Scanner(System.in);
                Scanner scString = new Scanner(System.in);
                int groundType = sc.nextInt();
                if(groundType == 0)
                {
                    testing = false;
                }
                else
                {
                    while(!validType)
                    {
                        switch (groundType)
                        {
                            case 1:
                            {
                                builder = new FieldTraceBuilder();
                                validType = true;
                                break;
                            }
                            case 2:
                            {
                                builder = new SoccerCourtBuilder();
                                validType = true;
                                break;
                            }
                            case 3:
                            {
                                builder = new SwimmingPoolBuilder();
                                validType = true;
                                break;
                            }
                            default:
                            {
                                System.out.println("Invalid ground type! Please choose again!");
                                groundType = sc.nextInt();
                            }
                        }
                    }
                    buildDirector = new BuildDirector(builder);
                    System.out.println("Please input the location:");
                    String location = scString.nextLine();
                    System.out.println("Please input the size of the ground:");
                    double size = sc.nextDouble();
                    System.out.println("Please input the duration of the construction:");
                    int due = sc.nextInt();
                    buildDirector.construct(location,size,due);
                    GameGround ground = builder.build();
                    ground.show();
                    System.out.println();
                    validType = false;
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Wrong input format! Ending the test...");
                System.out.println("-------- End of Builder Pattern testing ---------");
                return;
            }
        }
        System.out.println("-------- End of Builder Pattern testing ---------");
    }

    public static void main(String[] args)
    {
        System.out.println("------------------------- Builder ----------------------------");
        System.out.println("GameGround(): abstract class, constructing a game ground");
        System.out.println("Builder(): Interface, building a game ground");
        System.out.println("BuildDirector(): actually do the construction ");
        System.out.println("-------------------------------------------------------------");
        builderTest();
    }

}
