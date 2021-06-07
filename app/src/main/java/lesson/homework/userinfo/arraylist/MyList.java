package lesson.homework.userinfo.arraylist;

public interface MyList<T> {
    int size();

    boolean isEmpty();

    void add(T element);

    T add(int index, T element);

    T set(int index, T element);

    T get(int index);

    void remove(int index);

    void clear();
}
