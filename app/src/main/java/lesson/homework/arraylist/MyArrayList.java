package lesson.homework.arraylist;

public class MyArrayList<T> implements MyList<T>{
    private Object[] arr = new Object[5];
    private int count;
    void enlargeArray(){
        Object[]currentArray = new Object[arr.length + arr.length * (1/3)];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] !=null){
             currentArray[i] = arr[i];
            }else
                break;
        }
        arr = currentArray;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(T element) {
     for(int i = 0;i<arr.length;i++){
         if(arr[i] == null){
             if(i < arr.length - 5){
                 arr[i] = element;
             }else
                 enlargeArray();
         }
     }

    }


}
