package day34_CustomClass;

import day24_Methods.Test;

public class CapitalOne {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setTesterInfo("Muhtar",123,"Main",120000);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size());

    }
}
