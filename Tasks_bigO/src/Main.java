import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Task 1
        Task1 task1 = new Task1();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(31);
        System.out.println(task1.linearSearch(8, list));

        //Task 2
        int[] array = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
        Task2 sorter = new Task2();
        sorter.bubbleSort(array);
        System.out.println(java.util.Arrays.toString(array));

        //Task 3 push
        Task3 st = new Task3();
        st.push(1);
        st.push(2);

        //Task 3 pop
        st.pop();
        st.pop();

        //Task 3 peek
        System.out.println("Peek element of stack : "
                + st.peek() + "\n");
    }
}