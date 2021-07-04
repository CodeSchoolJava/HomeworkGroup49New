package lesson.homework.boxing.boxers;

public class Boxer {
    private String name;
    private String surName;
    private BoxersNationality nationality;
    private double height;
    private double weight;
    private int countWinMatches;
    private int countLoseMatches;
    private int allMatches = countWinMatches + countLoseMatches;
    private int point;
    private int HP;
    private SkillTypes skills;

    public Boxer() {
        countWinMatches = 0;
        countLoseMatches = 0;
        HP = 100;
        skills = SkillTypes.WEAK;
    }

    public static boolean fightLicense(CreateBoxer myBoxer) {
        return CreateBoxer.getMyBoxer().getSkills() != SkillTypes.WEAK;
    }

    public void setName(String name) {
        if (name.length() > 2 && name.length() < 11) {
            this.name = name;
        } else {
            System.out.println("Your name too short or long : ");
        }
    }

    public void setSurName(String surName) {
        if (name.length() > 2 && name.length() < 11) {
            this.surName = surName;
        } else {
            System.out.println("Your name too short or long : ");
        }
    }

    public void setAllMatches(int countWinMatches, int countLoseMatches) {
        this.allMatches = countLoseMatches + countWinMatches;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNationality(BoxersNationality nationality) {
        this.nationality = nationality;
    }

    public void setCountWinMatches(int countWinMatches) {
        this.countWinMatches = countWinMatches;

    }
    public void setPoint(int point) {
        this.point = point;
    }
    public void setCountLoseMatches(int countLoseMatches) {
        this.countLoseMatches = countLoseMatches;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setSkills(SkillTypes skills) {
        this.skills = skills;
    }

    public int getPoint() {
        return point;
    }





    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public BoxersNationality getNationality() {
        return nationality;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getCountWinMatches() {
        return countWinMatches;
    }

    public int getCountLoseMatches() {
        return countLoseMatches;
    }

    public int getHP() {
        return HP;
    }

    public SkillTypes getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "\n" +
                "Name : " + name + "\n" +
                "SurName : " + surName + "\n" +
                "Nationality : " + nationality + "\n" +
                "Weight : " + weight + "\n" +
                "Height : " + height + "\n" +
                "All Matches : " + allMatches + "\n" +
                "Win Matches : " + countWinMatches + "\n" +
                "Lose Matches : " + countLoseMatches + "\n" +
                "Skills : " + skills;
    }
}
