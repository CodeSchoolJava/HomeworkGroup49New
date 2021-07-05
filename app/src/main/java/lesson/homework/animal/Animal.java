package lesson.homework.animal;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();

    public void walk() {
        if (legs!=0) {
            System.out.println("walking" +"| legs are = "+ legs);
        }
        else {
            System.out.println("invalid");
        }
    }
}
