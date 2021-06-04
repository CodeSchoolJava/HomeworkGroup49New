package lesson.homework.school;

public class School {

    private RingListener ringListener;

    public School(RingListener ringListener) {
        this.ringListener = ringListener;
    }

    public void setRingListener(RingListener ringListener) {
        this.ringListener = ringListener;
    }

    public void bellRings() {
        System.out.println("Tslng");
        if (ringListener != null)
            ringListener.onRinged();
    }

}
