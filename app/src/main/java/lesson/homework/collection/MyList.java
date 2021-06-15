package lesson.homework.collection;

public interface MyList<T> {

    void add(T element);

    void add(T element, int index);

    void set(T element, int index);

    int size();

    T get (int index);

    boolean isEmpty();

    void remove(int index);

}
