package lesson.homework.collection.mylinkedlist;

public class MyNode {
    Object data;
    MyNode next;

    public MyNode(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

}