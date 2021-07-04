package lesson.homework.boxing.boxers.game;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

import lesson.homework.boxing.boxers.CreateBoxer;
import lesson.homework.boxing.boxers.MyBoxer;
import lesson.homework.boxing.boxers.OpponentBoxers;
import lesson.homework.boxing.boxers.OurBoxersCreator;
import lesson.homework.boxing.boxers.training.TricksType;


public class OpponentBoxerFight implements Runnable {

    private void doTrick(TricksType trick, MyBoxer myBoxer, OpponentBoxers opponentBoxer) {
        myBoxer.setHP(myBoxer.getHP() - trick.getTakeHP());
        opponentBoxer.setPoint(opponentBoxer.getPoint() + trick.getPoint());
        System.out.println("\n" + "NAME : " + myBoxer.getName() + "                 VS                   " + opponentBoxer.getName() + " : NAME");
        System.out.println("HP : " + myBoxer.getHP() + "                                      " + opponentBoxer.getHP() + " : HP");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void hit(MyBoxer myBoxer, OpponentBoxers opponentBoxer) {

        switch (myBoxer.getSkills()) {
            case AVERAGE:
                if (ThreadLocalRandom.current().nextInt(1, 4) == 1) {
                    doTrick(TricksType.BLOCK, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 4) == 2) {
                    doTrick(TricksType.PUNCHHITLEFT, myBoxer, opponentBoxer);
                } else if (ThreadLocalRandom.current().nextInt(1, 4) == 3) {
                    doTrick(TricksType.PUNCHHITRIGHT, myBoxer, opponentBoxer);

                }
                break;
            case STRONG:
                if (ThreadLocalRandom.current().nextInt(1, 6) == 1) {

                    doTrick(TricksType.BLOCK, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 6) == 2) {
                    doTrick(TricksType.PUNCHHITLEFT, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 6) == 3) {
                    doTrick(TricksType.PUNCHHITRIGHT, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 6) == 4) {
                    doTrick(TricksType.ELBOWHIT, myBoxer, opponentBoxer);
                } else if (ThreadLocalRandom.current().nextInt(1, 6) == 5) {
                    doTrick(TricksType.HOOK, myBoxer, opponentBoxer);

                } else {
                    opponentBoxer.setHP(opponentBoxer.getHP());
                    opponentBoxer.setPoint(opponentBoxer.getPoint());
                    System.out.println("\n" + "NAME : " + myBoxer.getName() + "                 VS                   " + opponentBoxer.getName() + " : NAME");
                    System.out.println("HP : " + myBoxer.getHP() + "                                      " + opponentBoxer.getHP() + " : HP");

                }
                break;
            case VERYSTRONG:

                if (ThreadLocalRandom.current().nextInt(1, 6) == 1) {

                    doTrick(TricksType.BLOCK, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 2) {
                    doTrick(TricksType.PUNCHHITLEFT, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 3) {
                    doTrick(TricksType.PUNCHHITRIGHT, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 4) {
                    doTrick(TricksType.ELBOWHIT, myBoxer, opponentBoxer);
                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 5) {
                    doTrick(TricksType.HOOK, myBoxer, opponentBoxer);

                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 6) {
                    doTrick(TricksType.HEAVYHIT, myBoxer, opponentBoxer);
                } else if (ThreadLocalRandom.current().nextInt(1, 8) == 7) {
                    doTrick(TricksType.UPPERCUT, myBoxer, opponentBoxer);
                } else {
                    opponentBoxer.setHP(opponentBoxer.getHP());
                    System.out.println("\n" + "NAME : " + myBoxer.getName() + "                 VS                   " + opponentBoxer.getName() + " : NAME");
                    System.out.println("HP : " + myBoxer.getHP() + "                                      " + opponentBoxer.getHP() + " : HP");
                }
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public int fight() {
        if (CreateBoxer.getMyBoxer().getHP() > 0 && Objects.requireNonNull(OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer())).getHP() > 0) {
            hit(CreateBoxer.getMyBoxer(), OurBoxersCreator.chooseBoxer(Fight.getChooseOpponentBoxer()));
            return fight();
        }
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void run() {

        fight();


    }
}

