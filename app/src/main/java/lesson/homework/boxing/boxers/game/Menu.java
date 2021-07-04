package lesson.homework.boxing.boxers.game;

import java.util.Scanner;

import lesson.homework.boxing.boxers.Boxer;
import lesson.homework.boxing.boxers.CreateBoxer;
import lesson.homework.boxing.boxers.OurBoxersCreator;
import lesson.homework.boxing.boxers.training.TrainingRoom;


public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private CreateBoxer myBoxerCreator = new CreateBoxer();
    private TrainingRoom trainingRoom = new TrainingRoom();
    private OurBoxersCreator ourBoxers = new OurBoxersCreator();
    private Fight fight = new Fight(ourBoxers, myBoxerCreator);
    private Thread thread = new Thread(fight);

    public void appearance() {

        System.out.println("--------------Welcome to FIGHT CLUB---------------");
        System.out.println("1)----------------Create your boxer---------------");
        System.out.println("2)---------------------FIGHT----------------------");
        System.out.println("3)--------------------Training--------------------");
        System.out.println("4)-----------------See your boxer-----------------");
        System.out.println("5)-----------------See our boxers-----------------");
        System.out.println("6)---------------------Help-----------------------");
        System.out.println("7)---------------------Exit-----------------------");
    }

    public void help() {
        System.out.println("Hi this is boxing game :");
        System.out.println("If you want fight our boxers first you must myBoxer your boxer :" + "\n ");
        firstPage();
    }


    public CreateBoxer getMyBoxerCreator() {
        return myBoxerCreator;
    }

    public void firstPage() {
        appearance();
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                myBoxerCreator.createMyBoxer();
                System.out.println("Congratulations you create your boxer : ");
                firstPage();
                break;
            case 2:
                if (CreateBoxer.getMyBoxer().getName() == null) {
                    System.out.println("You can't fight : You must create a boxer : ");
                    myBoxerCreator.createMyBoxer();
                }
                if (!Boxer.fightLicense(myBoxerCreator)) {
                    System.out.println("Your skills Weak you can't fight : You must up your skills : ");
                    trainingRoom.toTrain(CreateBoxer.getMyBoxer());
                    if (Boxer.fightLicense(myBoxerCreator)) {
                        System.out.println("Do you want FIGHT ? ");
                        System.out.println("1) YES");
                        System.out.println("2) Return to menu");
                        int fightChoose = scanner.nextInt();
                        switch (fightChoose) {
                            case 1:
                                fight.fight();
                                firstPage();
                                break;
                            case 2:
                                firstPage();
                                break;
                        }
                    } else {
                        System.out.println("You must Up your skill to Average : Enter to Training Room : ");
                        firstPage();
                    }
                } else {
                    fight.fight();
                    firstPage();
                }
                break;
            case 3:
                if (CreateBoxer.getMyBoxer().getName() == null) {
                    System.out.println("You can't to train : You must create a boxer : ");
                    myBoxerCreator.createMyBoxer();
                    System.out.println("Congratulations you create your boxer : ");
                }
                trainingRoom.toTrain(CreateBoxer.getMyBoxer());
                firstPage();
                break;
            case 4:
                if (CreateBoxer.getMyBoxer().getName() == null) {
                    System.out.println("You don't have a boxer you must create a boxer : ");
                    myBoxerCreator.createMyBoxer();
                } else {
                    System.out.println(CreateBoxer.getMyBoxer());
                }
                firstPage();
                break;
            case 5:
                ourBoxers.opponentBoxerName();
                int chooseBoxer = scanner.nextInt();
                while (chooseBoxer > 0 && chooseBoxer < 7) {

                    switch (chooseBoxer) {
                        case 1:
                            ourBoxers.opponentBoxerDetails1();
                            System.out.println(OurBoxersCreator.getBoxer1());
                            ourBoxers.opponentBoxerName();
                            chooseBoxer = scanner.nextInt();
                            break;
                        case 2:
                            ourBoxers.opponentBoxerDetails2();
                            System.out.println(OurBoxersCreator.getBoxer2());
                            ourBoxers.opponentBoxerName();
                            chooseBoxer = scanner.nextInt();
                            break;
                        case 3:
                            ourBoxers.opponentBoxerDetails3();
                            System.out.println(OurBoxersCreator.getBoxer3());
                            ourBoxers.opponentBoxerName();
                            chooseBoxer = scanner.nextInt();
                            break;
                        case 4:
                            ourBoxers.opponentBoxerDetails4();
                            System.out.println(OurBoxersCreator.getBoxer4());
                            ourBoxers.opponentBoxerName();
                            chooseBoxer = scanner.nextInt();
                            break;
                        case 5:
                            ourBoxers.opponentBoxerDetails5();
                            System.out.println(OurBoxersCreator.getBoxer5());
                            ourBoxers.opponentBoxerName();
                            chooseBoxer = scanner.nextInt();
                            break;
                        case 6:
                            firstPage();
                            break;

                    }
                }
                break;
            case 6:
                help();
            case 7:
                System.exit(1);


        }
    }
}
