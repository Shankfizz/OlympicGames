package test.moduletest;

import com.team.olympics.organizingcommittee.OrganizingCommittee;

/**
 * @author Hejing Cai
 * @description the test class for singleton pattern
 * @date 2021/10/24
 */
public class SingletonTest {

    public static void main(String[] args){
        System.out.println("--------------------------- Singleton ---------------------------------");
        System.out.println("OrganizingCommittee : getInstance() :create an instance of organizing committee if there is none.");
        System.out.println("");

        System.out.println("----------------测试单例模式-----------------");
        System.out.println();
        System.out.println("Get an instance of organizing committee for the first time: ");
        OrganizingCommittee organizingCommittee1 = OrganizingCommittee.getInstance();
        System.out.println();
        System.out.println("Get an instance of organizing committee again: ");
        OrganizingCommittee organizingCommittee2 = OrganizingCommittee.getInstance();
        System.out.println();
        System.out.println("Check whether the two instances are the same:");
        System.out.println(organizingCommittee1==organizingCommittee2);
        System.out.println();
        System.out.println("-------- End of Singleton Pattern testing ---------");

    }
}
