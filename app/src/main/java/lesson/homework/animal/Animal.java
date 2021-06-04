package lesson.homework.animal;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walks(int legs){
        if(legs!=0){
            System.out.println("This amimal walks on it's "+legs+" legs.");
        }
        else{
            System.out.println("This animal doesn't have legs.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                '}';
    }
}
