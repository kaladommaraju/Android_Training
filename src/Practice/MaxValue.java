package Practice;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(70);
        list.add(3);
        list.add(4);
        list.add(5);
        int value = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (value < list.get(i))
                value = list.get(i);


        }
        System.out.println("Max value:" + value);

    }
}
