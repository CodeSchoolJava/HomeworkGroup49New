 package lesson.homework.collection.arraylist;

public interface MyList<T> {
    int size();

    boolean isEmpty();

    void add(T element);

    void add(int index, T element);

    void set(int index, T element);

    T get(int index);

    void remove(int index);

    void clear();
}