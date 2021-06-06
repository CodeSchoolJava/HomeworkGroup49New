package lesson.homework.userinfo.arraylist;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private Object[] array = new Object[5];
    private int count;

    public MyArrayList(int arrayLen) {
        Object[] currentArr = new Object[arrayLen];
        if (arrayLen > 0) {
            array = currentArr;

        } else {
            System.out.println("Array length can't be minus");
        }
    }

    public MyArrayList() {

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    private void enlargeArray() {
        Object[] currArr = new Object[(int) (array.length + array.length * 0.3)];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                currArr[i] = array[i];
            } else
                break;
        }
        array = currArr;
    }

    @Override
    public void add(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                if (i < array.length - 5) {
                    array[i] = element;
                    count++;
                    break;
                } else {
                    array[i] = element;
                    enlargeArray();
                    count++;
                    break;
                }
            }
        }
    }

    @Override
    public T set(int index, T element) {
        try {
            if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Can't set your element : " + a);
        }
        return null;
    }

    @Override
    public T get(int index) {
        try {
            if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Can't set your element : " + a);
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                return (T) array[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList : " + Arrays.toString(array);
    }

}