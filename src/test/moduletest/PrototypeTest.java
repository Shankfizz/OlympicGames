package test.moduletest;

import com.team.olympics.applicationform.applicationform;
import com.team.olympics.organizingcommittee.OrganizingCommittee;

public class PrototypeTest {
    private int count = 0;

    public static void test()
    {
        System.out.println("正在初始化报名表");
        applicationform apl = new applicationform();
        apl.setAge("19");
        apl.setCountry("CN");
        apl.setName("MaKai");
        apl.setSprotEvent("Esport");

        System.out.println("姓名："+apl.getName());
        System.out.println("国籍："+apl.getCountry());
        System.out.println("年龄："+apl.getAge());
        System.out.println("运动项目："+apl.getSprotEvent());
        System.out.println("                            ");


        System.out.println("现将初始报名表克隆");
        applicationform apl_new = new applicationform();
        apl_new = apl.clone();

        System.out.println("姓名："+apl_new.getName());
        System.out.println("国籍："+apl_new.getCountry());
        System.out.println("年龄："+apl_new.getAge());
        System.out.println("运动项目："+apl_new.getSprotEvent());
        System.out.println("                            ");
        System.out.println("报名表是否为同一份"+(apl_new==apl));
    }

    public static void main(String[] args){
        System.out.println("--------------------------- Prototype ---------------------------------");
        test();
        System.out.println("------------------------ Prototype end ---------------------------------");
    }
}
