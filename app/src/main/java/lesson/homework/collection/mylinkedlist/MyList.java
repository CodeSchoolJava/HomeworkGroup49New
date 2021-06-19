package lesson.homework.collection.mylinkedlist;

public class MyList<T> {
    private MyNode root;
    private int count;

    public int size() {
        return count;
    }

    public void add(T data) {
        MyNode currentNode = new MyNode(data);
        if (root == null) {
            root = currentNode;
        } else if (root.next == null) {
            root.next = currentNode;
        } else {
            iterate(root.next).next = currentNode;
        }
        count++;
    }

    private MyNode iterate(MyNode myNode) {
        if (myNode.next != null) {
            return iterate(myNode.next);
        }
        return myNode;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "root=" + root +
                ", count=" + count +
                '}';

    }
}
