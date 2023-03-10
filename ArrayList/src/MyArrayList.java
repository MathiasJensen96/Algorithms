public class MyArrayList<T> {
    private T[] data;
    private int size;

    public MyArrayList() {
        data = (T[]) new Object[1];
        size = 0;
    }

    public void add(T item) {
        //Upper Big O = O(n)
        //Lower Big O = O(n)
        if (size == data.length) {
            resize(2 * data.length);
        }
        data[size++] = item;
    }

    public boolean delete(T item) {
        //Upper Big O = O(n)
        //Lower Big O = O(1)
        int index = find(item);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        if (size > 0 && size == data.length / 4) {
            resize(data.length / 2);
        }
        return true;
    }

    public boolean search(T item) {
        //Upper Big O = O(n)
        //Lower Big O = O(1)
        return find(item) != -1;
    }

    private int find(T item) {
        //Upper Big O = O(n)
        //Lower Big O = O(1)
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void resize(int newSize) {
        //Upper Big O = O(n)
        //Lower Big O = O(n)
        T[] newData = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public T get(int index) {
        //Upper Big O = O(1)
        return data[index];
    }

    public T set(int index, T item) {
        //Upper Big O = O(1)
        return data[index] = item;
    }

    public void insert(int index, T item) {
        T[] tempData = (T[]) new Object[data.length + 1];
        T tempElement;


        for (int i = 0; i < data.length; i++) {
            if (i < index) {
                tempData[i] = data[i];
            } else if (i == index) {
                tempElement = data[i];
                tempData[i] = item;
                i = i + 1;
                tempData[i] = tempElement;
                tempData[i+1] = data[i];
            } else if (i > index) {
                tempData[i + 1] = data[i];
            }
        }
        data = tempData;
    }

    public void clear() {
        T[] tempData = (T[]) new Object[1];
        int tempSize = 0;
        data = tempData;
        size = tempSize;
    }

    public int  size() {
        int s = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                s++;
            }
        }
        return s;
    }

    public boolean isEmpty(){
        boolean isEmpty = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public T[] toArray(){
        return data;
    }

    public T[] sort() {
        T[] tempData = (T[]) new Object[data.length];
        T value1;
        T value2;
        for (int i = 0; i < data.length; i++) {
            value1 = data[i];
            value2 = data[i+1];
            if (value1 > value2) {

            }
        }

        data = tempData;
        return data;
    }

}