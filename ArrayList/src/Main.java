import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArray = new MyArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);

        System.out.println("Array after adding items: " + myArray);

        boolean isDeleted = myArray.delete(3);
        if (isDeleted) {
            System.out.println("Deleted item 3 successfully");
        } else {
            System.out.println("Item 3 not found in array");
        }

        boolean isFound = myArray.search(4);
        if (isFound) {
            System.out.println("Found item 4 in array");
        } else {
            System.out.println("Item 4 not found in array");
        }

        int myElement = myArray.get(2);
        System.out.println("Value found at index 2 = " + myElement);

        myArray.set(2, 10);
        System.out.println("New value at index 2 = " + myArray.get(2));


        System.out.println(Arrays.deepToString(myArray.toArray()));
        System.out.println(myArray.size());
        myArray.insert(0, 10);
        System.out.println(Arrays.deepToString(myArray.toArray()));
        System.out.println(myArray.size());

        myArray.clear();
        System.out.println(Arrays.deepToString(myArray.toArray()));
        System.out.println(myArray.size());

        System.out.println(myArray.isEmpty());

    }
}


