package com.team.olympics.interpreter;


import java.util.HashSet;
import java.util.Set;

/**
 * @author Yifan Li
 * @description ContextInterpreter, the context of the interpreter pattern.
 * @create 2021/10/27
 **/
public class ContextInterpreter {


    private Set<String> simpleUser = new HashSet<>();
    private Set<String> simpleTools = new HashSet<>();
    private Set<String> essentialUser = new HashSet<>();
    private Set<String> essentialTools = new HashSet<>();
    //SimpleAction Expression
    private Expression simpleUseAction;
    //EssentialAction Expression
    private Expression essentialUseAction;

    public ContextInterpreter() {
        simpleUseAction = new ToolAndUserExpression();
        essentialUseAction = new ToolAndUserExpression();
    }

    //Add elements to simpleUser
    public void addToSimpleUser(String user) {
        simpleUser.add(user);
    }

    //Add elements to EssentialUser
    public void addToEssentialUser(String user) {
        essentialUser.add(user);
    }


    //Add elements to simpleTools that both simple and essential people can use
    public void addToSimpleTools(String tool) {
        simpleTools.add(tool);
        essentialTools.add(tool);
    }


    //Add elements to essentialTools that essential people can use
    public void addToEssentialTools(String tool) {
        essentialTools.add(tool);
    }

    public void initToolAndUserExpression() {
        //initSimpleUseAction
        AggregateExpression simpleUserList = new AggregateExpression(simpleUser);
        AggregateExpression simpleToolsList = new AggregateExpression(simpleTools);
        simpleUseAction = new ToolAndUserExpression(simpleUserList, simpleToolsList);


        //initEssentialUseAction
        AggregateExpression essentialUserList = new AggregateExpression(essentialUser);
        AggregateExpression essentialToolsList = new AggregateExpression(essentialTools);
        essentialUseAction = new ToolAndUserExpression(essentialUserList, essentialToolsList);

    }


    //Determine if the use relationship is valid
    public void isAllowedUse(String info) {
        if (!info.contains("使用")) {
            System.out.println("请以“某人使用某物的方式输入！！！”");
        } else {
            boolean legality = simpleUseAction.interpret(info) ||
                    essentialUseAction.interpret(info);
            if (legality) {
                System.out.println(info + "是允许的");
            } else {
                System.out.println(info + "是不允许的");
            }
        }
    }


    public Set<String> getSimpleUser() {
        return simpleUser;
    }

    public void setSimpleUser(Set<String> simpleUser) {
        this.simpleUser = simpleUser;
    }

    public Set<String> getSimpleTools() {
        return simpleTools;
    }

    public void setSimpleTools(Set<String> simpleTools) {
        this.simpleTools = simpleTools;
    }

    public Set<String> getEssentialUser() {
        return essentialUser;
    }

    public void setEssentialUser(Set<String> essentialUser) {
        this.essentialUser = essentialUser;
    }

    public Set<String> getEssentialTools() {
        return essentialTools;
    }

    public void setEssentialTools(Set<String> essentialTools) {
        this.essentialTools = essentialTools;
    }

    public Expression getSimpleUseAction() {
        return simpleUseAction;
    }

    public void setSimpleUseAction(Expression simpleUseAction) {
        this.simpleUseAction = simpleUseAction;
    }

    public Expression getEssentialUseAction() {
        return essentialUseAction;
    }

    public void setEssentialUseAction(Expression essentialUseAction) {
        this.essentialUseAction = essentialUseAction;
    }


    @Override
    public String toString() {
        return "ContextInterpreter{" +
                "simpleUser=" + simpleUser +
                ", simpleTools=" + simpleTools +
                ", essentialUser=" + essentialUser +
                ", essentialTools=" + essentialTools +
                ", simpleUseAction=" + simpleUseAction +
                ", essentialUseAction=" + essentialUseAction +
                '}';
    }
}
