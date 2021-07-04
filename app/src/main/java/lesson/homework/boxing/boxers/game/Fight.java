package lesson.homework.boxing.boxers.game;

import java.util.Objects;
import java.util.Scanner;

import lesson.homework.boxing.boxers.CreateBoxer;
import lesson.homework.boxing.boxers.OurBoxersCreator;

public class Fight implements Runnable {
    private static int chooseOpponentBoxer;
    private MyBoxerFight myBoxerFight = new MyBoxerFight();
    private OpponentBoxerFight opponentBoxerFight = new OpponentBoxerFight();
    private Thread threadTime = new Thread();
    private Thread thread1 = new Thread(myBoxerFight);
    private Thread thread2 = new Thread(opponentBoxerFight);
    private Scanner scanner = new Scanner(System.in);
    private OurBoxersCreator ourBoxers;
    private CreateBoxer myBoxer;


    public Fight(OurBoxersCreator ourBoxers, CreateBoxer myBoxer) {
        this.ourBoxers = ourBoxers;
        this.myBoxer = myBoxer;
    }

    public int chooseOpponentBoxer() {
        System.out.println("-You want fight with our boxers but first you must choose a opponent boxer-");
        ourBoxers.opponentBoxerName();
        chooseOpponentBoxer = scanner.nextInt();
        switch (chooseOpponentBoxer) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
        }
        return 0;
    }

    public void beginMatch() {

        switch (chooseOpponentBoxer()) {
            case 0:
                System.out.println("You don't choose a opponent boxer");
                break;
            case 1:
                ourBoxers.opponentBoxerDetails1();
                System.out.println(OurBoxersCreator.getBoxer1() + " \n" + " \n");

                System.out.print("          VS         " + " \n" + " \n");
                System.out.println(CreateBoxer.getMyBoxer());

                break;
            case 2:
                ourBoxers.opponentBoxerDetails2();
                System.out.println(OurBoxersCreator.getBoxer2() + " \n" + " \n");
                System.out.print("          VS         " + " \n" + " \n");
                System.out.println(CreateBoxer.getMyBoxer());

                break;
            case 3:
                ourBoxers.opponentBoxerDetails3();
                System.out.println(OurBoxersCreator.getBoxer3() + " \n" + " \n");
                System.out.print("          VS         " + " \n" + " \n");
                System.out.println(CreateBoxer.getMyBoxer());

                break;
            case 4:
                ourBoxers.opponentBoxerDetails4();
                System.out.println(OurBoxersCreator.getBoxer4() + " \n" + " \n");
                System.out.print("          VS         " + " \n" + " \n");
                System.out.println(CreateBoxer.getMyBoxer());

                break;
            case 5:
                ourBoxers.opponentBoxerDetails5();
                System.out.println(OurBoxersCreator.getBoxer5() + " \n" + " \n");
                System.out.print("          VS         " + " \n" + " \n");
                System.out.println(CreateBoxer.getMyBoxer());
                break;
            case 6:
                break;

        }
    }

    private void roundTime() {
        for (int i = 1; i <= 3; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
    }

    public void fight() {
        beginMatch();
        roundTime();
        System.out.println("\n" + "------Match Begins-------");
        System.out.println("----------FIGHT----------");
        thread1.start();
        thread2.start();
        System.out.println(judge());
    }

    public String judge() {
        if (CreateBoxer.getMyBoxer().getPoint() > Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).getPoint()) {
            CreateBoxer.getMyBoxer().setCountWinMatches(CreateBoxer.getMyBoxer().getCountWinMatches() + 1);
            Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).setCountLoseMatches(Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).getCountLoseMatches() + 1);
            return "THE WINNER IS : " + CreateBoxer.getMyBoxer().getName() + " : POINT IS : " + CreateBoxer.getMyBoxer().getPoint();
        } else {
            CreateBoxer.getMyBoxer().setCountLoseMatches(CreateBoxer.getMyBoxer().getCountLoseMatches() + 1);
            Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).setCountWinMatches(Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).getCountWinMatches() + 1);
            return "THE WINNER IS " + Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).getName() + " : POINT IS : " + OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer()).getPoint();

        }
    }

    public static int getChooseOpponentBoxer() {
        return chooseOpponentBoxer;
    }

    @Override
    public void run() {
        fight();
    }
}

