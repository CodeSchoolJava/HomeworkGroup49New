package lesson.homework.marks;

public class A extends Marks {

    private String name;
    private String surName;
    private double firstMark;
    private double secondMark;
    private double thirdMark;

    public A(String name, String surName, double firstMark, double secondMark, double thirdMark) {
        this.name = name;
        this.surName = surName;
        this.firstMark = firstMark;
        this.secondMark = secondMark;
        this.thirdMark = thirdMark;
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

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", firstMark=" + firstMark +
                ", secondMark=" + secondMark +
                ", thirdMark=" + thirdMark +
                '}';
    }

    @Override
    public void getPercentage() {
        System.out.println("The A student's percentage of marks is " + (firstMark + secondMark
                + thirdMark) / 3);

    }
}
