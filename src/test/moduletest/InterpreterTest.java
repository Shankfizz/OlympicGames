package test.moduletest;

import com.team.olympics.interpreter.ContextInterpreter;

import java.util.Scanner;


/**
 * @author Yifan Li
 * @description the test class for interpreter pattern
 * @date 2021/10/26
 */
public class InterpreterTest {

    // interpreter test method
    public static  void  interpreterTest(){
        System.out.println("——————3———————-------------------------------------———— Test[Interpreter]Pattern —————————————-------------------------------------————");
        System.out.println("AggregateExpression : interpret() : This method is implemented by the AggregateExpression class. It's used to determine if a String as a parameter is included in the set of the AggregateExpression class.");
        System.out.println(" ToolAndUserExpression : interpret() : This method is implemented by the  ToolAndUserExpression class. It's used to disassemble the parameter whose type is String according to the syntax tree, which is used to determine whether the entire sentence is valid.");
        System.out.println("ContextInterpreter :allowUse(): It is used to determine whether a sentence is legal, that is, low level permission and high level permission should satisfy at least one of them.");
        System.out.println("");

    }


    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        ContextInterpreter contextInterpreter = new ContextInterpreter();
        interpreterTest();
        while(true)
        {
            System.out.println("请输入一般使用者（停止输入请输入“~”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("~")) break;
                else
                {
                    contextInterpreter.addToSimpleUser(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入一般工具（停止输入请输入“~”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("~")) break;
                else
                {
                    contextInterpreter.addToSimpleTools(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入组委会成员（停止输入请输入“~”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("~")) break;
                else
                {
                    contextInterpreter.addToEssentialUser(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入重要工具（停止输入请输入“~”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("~")) break;
                else
                {
                    contextInterpreter.addToEssentialTools(s);
                }
            }
        }
        contextInterpreter.initToolAndUserExpression();
        while (true)
        {
            System.out.println("请以“某人使用某物”的形式输入测试语句！（停止输入请输入“~”）");
            String s = scanner.next();
            if(s.equals("~")) break;
            else
            {
                contextInterpreter.isAllowedUse(s);
            }
        }
        System.out.println("Interpreter设计模式测试完毕！");
    }
        

}
