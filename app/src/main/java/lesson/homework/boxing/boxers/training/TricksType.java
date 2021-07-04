package lesson.homework.boxing.boxers.training;

public enum TricksType {
    BLOCK(0, 5, 1),
    PUNCHHITLEFT(2, 5,2),
    PUNCHHITRIGHT(2, 5,3),
    ELBOWHIT(3, 10,4),
    HOOK(4, 10,5),
    HEAVYHIT(4, 15,6),
    UPPERCUT(5, 20,7);
    private int point;
    private int takeHP;
    private int value;

    TricksType(int point, int takeHP, int value) {
        this.point = point;
        this.takeHP = takeHP;
        this.value = value;
    }

    public int getPoint() {
        return point;
    }

    public int getTakeHP() {
        return takeHP;
    }

    public int getValue() {
        return value;
    }
}

