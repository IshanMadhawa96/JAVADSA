package self_leran;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.insert(50);
//        //numbers.removeAt(2);
//        System.out.println(numbers.indexOf(20));
//        System.out.println(numbers.indexOf(200));
//        //numbers.print();
        // java has two dynamic arrays
        //1.Vector-synchronized
        //2.Array List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(0);// remove element
        list.indexOf(20);// find index
        list.size(); //find array list size
        System.out.println(list);

    }
}
