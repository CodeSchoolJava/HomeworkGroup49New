package lesson.homework.marks;

public class B extends Marks {
    private String name;
    private String surName;
    private double firstMark;
    private double secondMark;
    private double thirdMark;
    private double fourthMark;

    public B(String name, String surName, double firstMark, double secondMark, double thirdMark, double fourthMark) {
        this.name = name;
        this.surName = surName;
        this.firstMark = firstMark;
        this.secondMark = secondMark;
        this.thirdMark = thirdMark;
        this.fourthMark = fourthMark;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getFirstMark() {
        return firstMark;
    }

    public double getSecondMark() {
        return secondMark;
    }

    public double getThirdMark() {
        return thirdMark;
    }

    public double getFourthMark() {
        return fourthMark;
    }

    @Override
    public void getPercentage() {
        System.out.println("The B student's percentage of marks is " + (firstMark + secondMark
                + thirdMark + fourthMark) / 4);
    }
}
