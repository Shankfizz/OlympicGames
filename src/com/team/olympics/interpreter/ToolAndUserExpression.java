package com.team.olympics.interpreter;

/**
 * @author: Yifan Li
 * @description: ToolAndUserExpression
 * @create: 2021/10/27
 **/
public class ToolAndUserExpression implements Expression{

    private Expression user = null;
    private Expression tools = null;

    public ToolAndUserExpression() {
    }

    public ToolAndUserExpression(Expression user, Expression tools) {
        this.user = user;
        this.tools = tools;
    }

    //override ToolAndUserExpression interpret，
    // pay attention to same interpret from AggregateExpression

    @Override
    public boolean interpret(String info) {
        String content[] = info.split("使用");
        try{
            return user.interpret(content[0])&&tools.interpret(content[1]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("请以“某人使用某物”的格式输入！！");
            return false;
        }
    }


    public Expression getUser() {
        return user;
    }

    public void setUser(Expression user) {
        this.user = user;
    }

    public Expression getTools() {
        return tools;
    }

    public void setTools(Expression tools) {
        this.tools = tools;
    }


    @Override
    public String toString() {
        return "class ToolAndUserExpression implements Expression," +
                "ToolAndUserExpression{" +
                "user=" + user +
                ", tools=" + tools +
                '}';
    }
}
