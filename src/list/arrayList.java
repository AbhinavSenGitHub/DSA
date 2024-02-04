package list;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        System.out.println(list.contains(12));
        System.out.println(list);                             //list
        System.out.println(list.remove(3));
        System.out.println(list);                             //list
        System.out.println(list.set(0, 20));
        System.out.println(list);                             //list
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        System.out.println(list.indexOf(14));   // use for knowing the index.
        System.out.println(list);                             //list

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>(5);
        System.out.println("Enter list:- ");
        for (int i = 0; i < 5; i++) {
            arrList.add(sc.nextInt());
        }
//        one way
        for (int i = 0; i < 5; i++) {
            System.out.println(arrList.get(i));   //pass index here always
        }

//        or
        System.out.println(arrList);



        //multi ArrayList
        ArrayList<ArrayList<Integer>> multi = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            multi.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multi.get(i).add(sc.nextInt());
            }
        }
        System.out.println(multi);

    }
}
