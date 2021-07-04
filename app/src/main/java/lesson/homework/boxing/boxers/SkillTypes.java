package lesson.homework.boxing.boxers;


import lesson.homework.boxing.boxers.training.TricksType;

public enum SkillTypes {
    WEAK,
    AVERAGE,
    STRONG,
    VERYSTRONG;
    private TricksType block;
    private TricksType punchLeft;
    private TricksType punchRight;
    private TricksType elbow;
    private TricksType hook;
    private TricksType heavyHit;
    private TricksType uppercut;


    public TricksType getHook() {
        return hook;
    }

    public void setHook(TricksType hook) {
        this.hook = hook;
    }

    public TricksType getBlock() {
        return block;
    }

    public void setBlock(TricksType block) {
        this.block = block;
    }

    public TricksType getPunchLeft() {
        return punchLeft;
    }

    public void setPunchLeft(TricksType punchLeft) {
        this.punchLeft = punchLeft;
    }

    public TricksType getPunchRight() {
        return punchRight;
    }

    public void setPunchRight(TricksType punchRight) {
        this.punchRight = punchRight;
    }

    public TricksType getElbow() {
        return elbow;
    }

    public void setElbow(TricksType elbow) {
        this.elbow = elbow;
    }

    public TricksType getUppercut() {
        return uppercut;
    }

    public void setUppercut(TricksType uppercut) {
        this.uppercut = uppercut;
    }

    public TricksType getHeavyHit() {
        return heavyHit;
    }

    public void setHeavyHit(TricksType heavyHit) {
        this.heavyHit = heavyHit;
    }
}

