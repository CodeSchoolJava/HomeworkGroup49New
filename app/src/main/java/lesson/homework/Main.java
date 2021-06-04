package lesson.homework;

import lesson.homework.school.Pupils;
import lesson.homework.school.School;

public class Main {
    public static void main(String[] args) throws Exception {
        Pupils pupils=new Pupils();
        School school=new School(pupils);
        school.bellRings();
    }
}
