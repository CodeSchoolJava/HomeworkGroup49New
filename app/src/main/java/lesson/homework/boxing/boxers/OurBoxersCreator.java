package lesson.homework.boxing.boxers;

import java.util.Scanner;

public class OurBoxersCreator {
    private static OpponentBoxers boxer1 = new OpponentBoxers();
    private static OpponentBoxers boxer2 = new OpponentBoxers();
    private static OpponentBoxers boxer3 = new OpponentBoxers();
    private static OpponentBoxers boxer4 = new OpponentBoxers();
    private static OpponentBoxers boxer5 = new OpponentBoxers();
    private Scanner scanner = new Scanner(System.in);

    public void opponentBoxerName() {
        System.out.println("-This is our Fight Club Boxers-");
        System.out.println("1) Arthur Williams");
        System.out.println("2) John Smith");
        System.out.println("3) Ashot Babajanyan");
        System.out.println("4) Ivan Zakharov");
        System.out.println("5) Gabriel Kapanadze");
        System.out.println("6) Return to menu");
    }

    public void opponentBoxerDetails1() {
        boxer1.setName("Arthur");
        boxer1.setSurName("Williams");
        boxer1.setNationality(BoxersNationality.ENGLAND);
        boxer1.setHeight(183);
        boxer1.setWeight(81);
        boxer1.setCountWinMatches(20);
        boxer1.setCountLoseMatches(5);
        boxer1.setAllMatches(boxer1.getCountWinMatches(), boxer1.getCountLoseMatches());
        boxer1.setSkills(SkillTypes.STRONG);
    }

    public static OpponentBoxers getBoxer1() {
        return boxer1;
    }

    public void opponentBoxerDetails2() {
        boxer2.setName("John");
        boxer2.setSurName("Smith");
        boxer2.setNationality(BoxersNationality.DANIA);
        boxer2.setHeight(173);
        boxer2.setWeight(69);
        boxer2.setCountWinMatches(14);
        boxer2.setCountLoseMatches(10);
        boxer2.setAllMatches(boxer2.getCountWinMatches(), boxer2.getCountLoseMatches());
        boxer2.setSkills(SkillTypes.AVERAGE);
    }

    public static OpponentBoxers getBoxer2() {
        return boxer2;
    }

    public void opponentBoxerDetails3() {
        boxer3.setName("Ashot");
        boxer3.setSurName("Babajanyan");
        boxer3.setNationality(BoxersNationality.ARMENIAN);
        boxer3.setHeight(191);
        boxer3.setWeight(85);
        boxer3.setCountWinMatches(25);
        boxer3.setCountLoseMatches(3);
        boxer3.setAllMatches(boxer3.getCountWinMatches(), boxer3.getCountLoseMatches());
        boxer3.setSkills(SkillTypes.VERYSTRONG);
    }

    public static OpponentBoxers getBoxer3() {
        return boxer3;
    }

    public void opponentBoxerDetails4() {
        boxer4.setName("Ivan");
        boxer4.setSurName("Zakharov");
        boxer4.setNationality(BoxersNationality.RUSSIAN);
        boxer4.setHeight(180);
        boxer4.setWeight(75);
        boxer4.setCountWinMatches(23);
        boxer4.setCountLoseMatches(4);
        boxer4.setAllMatches(boxer4.getCountWinMatches(), boxer4.getCountLoseMatches());
        boxer4.setSkills(SkillTypes.STRONG);
    }

    public static OpponentBoxers getBoxer4() {
        return boxer4;
    }

    public void opponentBoxerDetails5() {
        boxer5.setName("Gabriel");
        boxer5.setSurName("Kapanadze");
        boxer5.setNationality(BoxersNationality.GEORGIA);
        boxer5.setHeight(190);
        boxer5.setWeight(85);
        boxer5.setCountWinMatches(14);
        boxer5.setCountLoseMatches(5);
        boxer5.setAllMatches(boxer5.getCountWinMatches(), boxer5.getCountLoseMatches());
        boxer5.setSkills(SkillTypes.AVERAGE);
    }

    public static OpponentBoxers getBoxer5() {
        return boxer5;
    }

    public static OpponentBoxers chooseBoxer(int boxerNumber) {
        switch (boxerNumber) {
            case 1:
                return getBoxer1();
            case 2:
                return getBoxer2();
            case 3:
                return getBoxer3();
            case 4:
                return getBoxer4();
            case 5:
                return getBoxer5();
        }
        return null;
    }

    @Override
    public String toString() {

        return "--------------Opponent Boxer--------------" +
                super.toString();
    }
}

