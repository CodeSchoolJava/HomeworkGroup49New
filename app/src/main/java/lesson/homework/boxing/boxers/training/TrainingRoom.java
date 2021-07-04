package lesson.homework.boxing.boxers.training;

import java.util.Scanner;

import lesson.homework.boxing.boxers.MyBoxer;
import lesson.homework.boxing.boxers.SkillTypes;


public class TrainingRoom {
    private Scanner scanner = new Scanner(System.in);

    public void toTrain(MyBoxer myBoxer) {
        System.out.println("----------Welcome to Training Room----------");
        System.out.println("-You must teach all trick to up your skills-");
        switch (myBoxer.getSkills()) {
            case WEAK:
                skillsToAverage(myBoxer);
                if (myBoxer.getSkills().getBlock() == null || myBoxer.getSkills().getPunchLeft() == null || myBoxer.getSkills().getPunchRight() == null) {

                    System.out.println("You exit in training room : Therefore your skill remain Weak : ");

                } else {
                    myBoxer.setSkills(SkillTypes.AVERAGE);
                    System.out.println("Congratulation your skill type Average : ");
                }
                break;
            case AVERAGE:
                skillsToStrong(myBoxer);
                if (myBoxer.getSkills().getElbow() == null || myBoxer.getSkills().getHook() == null) {
                    System.out.println("You exit in training room : Therefore your skill remain Average : ");
                } else {
                    myBoxer.setSkills(SkillTypes.STRONG);
                    System.out.println("Congratulation your skill type Strong : ");
                }
                break;
            case STRONG:
                skillsToVeryStrong(myBoxer);
                if (myBoxer.getSkills().getHeavyHit() == null || myBoxer.getSkills().getUppercut() == null) {
                    System.out.println("You exit in training room : Therefor your skill remain Strong : ");
                } else {
                    myBoxer.setSkills(SkillTypes.VERYSTRONG);
                    System.out.println("Congratulation your skill type Strong : ");
                }
                break;
            case VERYSTRONG:
                System.out.println("Your skills already Very Strong : ");
                break;
        }
    }


    public void skillsToAverage(MyBoxer myBoxer) {
        System.out.println("------------Your Skill is Weak------------");
        System.out.println("-------------Teach all tricks-------------");
        System.out.println("1) Block");
        System.out.println("2) Punch Hit Left");
        System.out.println("3) Punch Hit Right");
        System.out.println("4) Exit in training room : ");
        int chooseTrick = scanner.nextInt();
        switch (chooseTrick) {
            case 1:
                myBoxer.getSkills().setBlock(TricksType.BLOCK);
                System.out.println("You learn how to do Block :  ");
                skillsToAverage(myBoxer);
                break;
            case 2:
                myBoxer.getSkills().setPunchLeft(TricksType.PUNCHHITLEFT);
                System.out.println("You learn how to do Punch Hit Left : ");
                skillsToAverage(myBoxer);
                break;
            case 3:
                myBoxer.getSkills().setPunchRight(TricksType.PUNCHHITRIGHT);
                System.out.println("You learn how to do Punch Hit Right : ");
                skillsToAverage(myBoxer);
                break;
            case 4:
                break;
        }

    }

    public void skillsToStrong(MyBoxer myBoxer) {
        System.out.println("-----------Your Skill is Average-----------");
        System.out.println("-------------Teach all tricks-------------");
        System.out.println("1) Elbow");
        System.out.println("2) Hook");
        System.out.println("3) Exit in training room");
        int chooseTrick = scanner.nextInt();
        switch (chooseTrick) {
            case 1:
                myBoxer.getSkills().setElbow(TricksType.ELBOWHIT);
                System.out.println("You learn how to do Elbow : ");
                skillsToStrong(myBoxer);
                break;
            case 2:
                myBoxer.getSkills().setHook(TricksType.HOOK);
                System.out.println("You learn how to do Elbow : ");
                skillsToStrong(myBoxer);
                break;
            case 3:
                break;
        }
    }

    public void skillsToVeryStrong(MyBoxer myBoxer) {
        System.out.println("-----------Your Skill is Strong-----------");
        System.out.println("-------------Teach all tricks-------------");
        System.out.println("1) Heavy Hit");
        System.out.println("2) Uppercut");
        System.out.println("3) Exit in training room : ");
        int chooseTrick = scanner.nextInt();
        switch (chooseTrick) {
            case 1:
                myBoxer.getSkills().setHeavyHit(TricksType.HEAVYHIT);
                System.out.println("You learn how to do Heavy Hit : ");
                skillsToVeryStrong(myBoxer);
                break;
            case 2:
                myBoxer.getSkills().setUppercut(TricksType.UPPERCUT);
                System.out.println("You learn how to do Uppercut : ");
                skillsToVeryStrong(myBoxer);
                break;
            case 3:
                break;
        }
    }
}

