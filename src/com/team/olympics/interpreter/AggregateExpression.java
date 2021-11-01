package com.team.olympics.interpreter;


import java.util.HashSet;
import java.util.Set;

/**
 * @author Yifan Li
 * @description AggregateExpression
 * @create 2021/10/27
 **/
public class AggregateExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public AggregateExpression(Set<String> setParam) {
        set.addAll(setParam);
    }


    @Override
    public String toString() {
        return "class AggregateExpression implements Expression," +
                "AggregateExpression{" +
                "set=" + set +
                '}';
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public boolean interpret(String info) {

        return set.contains(info);
    }
}


