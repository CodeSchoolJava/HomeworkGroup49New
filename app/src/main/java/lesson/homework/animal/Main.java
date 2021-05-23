package lesson.homework.animal;

public class Main {
    public static void main(String[] args) {



        Fish d = new Fish(0);
        Cat c = new Cat("Fluffy");
        Animal a = new Fish(0);
        Animal e = new Spider(12);
        Pet p = new Cat("Pushok");
        c.walk();
        c.eat();
        c.play();
        e.eat();


//        MassageReceiver massageReceiver = new MassageReceiver();
//        MassageSender massageSender = new MassageSender();
//        massageSender.setListener(massageReceiver);
//        massageSender.sendMessage(" uxarkelem");

    }
}
