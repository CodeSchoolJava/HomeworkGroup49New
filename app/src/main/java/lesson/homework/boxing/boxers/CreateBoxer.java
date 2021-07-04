package lesson.homework.boxing.boxers;

import java.util.Scanner;

public class CreateBoxer {
    private Scanner scanner = new Scanner(System.in);
    private static MyBoxer myBoxer = new MyBoxer();

    public void name() {
        System.out.println("Write your boxer name : ");
        String name = scanner.nextLine();
        myBoxer.setName(name);

    }

    public void surName() {
        System.out.println("Write your boxer surName : ");
        String surName = scanner.nextLine();
        myBoxer.setSurName(surName);

    }

    public void nationality() {
        System.out.println("Choose your boxer nationality : ");
        System.out.println("1) Armenian ");
        System.out.println("2) Russian ");
        System.out.println("3) England ");
        System.out.println("4) Georgia ");
        System.out.println("5) Dania ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                myBoxer.setNationality(BoxersNationality.ARMENIAN);
                break;
            case 2:
                myBoxer.setNationality(BoxersNationality.RUSSIAN);
                break;
            case 3:
                myBoxer.setNationality(BoxersNationality.ENGLAND);
                break;
            case 4:
                myBoxer.setNationality(BoxersNationality.GEORGIA);
                break;
            case 5:
                myBoxer.setNationality(BoxersNationality.DANIA);
                break;
        }
    }

    public void weight() {
        System.out.println("Write your boxer weight in range [60 (KG) -- 120 (KG)] : ");
        double weight = scanner.nextDouble();
        myBoxer.setWeight(weight);
    }

    public void height() {
        System.out.println("Write your boxer height in range [150 (CM) -- 205 (CM)] : ");
        double height = scanner.nextDouble();
        myBoxer.setHeight(height);

    }

    public void createMyBoxer() {
        name();
        surName();
        nationality();
        weight();
        height();
    }

    public static MyBoxer getMyBoxer() {
        return myBoxer;
    }


}

