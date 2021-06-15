package lesson.homework.collection;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private Object[] arr = new Object[10];
    private int count;


    public MyArrayList() {

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", count=" + count +
                '}';
    }

    public MyArrayList(int length) {
        if (length > 0) {
            this.arr = new Object[length];
        } else {
            System.out.println("o no");
        }
    }


    private void enlargeArray() {
        Object[] currentArray = new Object[(int) (arr.length + arr.length * 0.3)];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                currentArray[i] = arr[i];
            }else
                break;
        }
        arr = currentArray;

    }

    @Override
    public void add(T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                if (i >= arr.length - 5) {
                    enlargeArray();
                }
                arr[i] = element;
                count++;
                break;
            }

        }


    }

    @Override
    public void add(T element, int index) {

        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        count++;
    }

    @Override
    public void set(T element, int index) {
        arr[index] = element;

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public boolean isEmpty() {

        return count == 0;
    }

    @Override
    public void remove(int index) {
        Object[] object = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            } else
                object[i] = arr[i];
        }
        count--;
        arr = object;
    }

        }



