package lesson.homework.boxing.boxers;

public enum BoxersNationality {
    ARMENIAN(1),
    RUSSIAN(2),
    ENGLAND(3),
    GEORGIA(4),
    DANIA(5);
    private int value;

    BoxersNationality(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

