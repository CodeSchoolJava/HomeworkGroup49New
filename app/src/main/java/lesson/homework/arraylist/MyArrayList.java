package lesson.homework.arraylist;

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
                if (i >= array.length - 5) {
                    enlargeArray();
                }
                array[i] = element;
                count++;
                break;
            }
        }
    }

    @Override
    public void add(int index, T element) {
        if ((index < 0 || index >= size())) {
            excOutOfIndex(index);
        } else {
            for (int i = array.length - 1; i > index; i--) {
                if (array[i - 1] != null) {
                    array[i] = array[i - 1];
                }
            }
            array[index] = element;
            count++;
        }
    }


    @Override
    public void set(int index, T element) {
        if (index < 0 || index >= size()) {
            excOutOfIndex(index);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    array[i] = element;
                }
            }
        }
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            excOutOfIndex(index);
        }

        return (T) array[index];
    }

    @Override
    public void remove(int index) {
        array[index] = null;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        array = new Object[5];
        count = 0;
    }

    private void excOutOfIndex(int index) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Can't do the action : " + a);
        }
    }


    @Override
    public String toString() {
        return "MyArrayList : " + Arrays.toString(array);
    }

}