package com.hillel.IhorProkhorov.HomeTaskEight;

import java.util.ArrayList;

public class RunEight {

    public static void main(String[] args) {

        Eight eight = new Eight();

        Eight eight1 = new Eight();

        ArrayList list = new ArrayList();
        list.add("c");
        list.add("e");
        list.add("g");
        list.add("h");

        eight.clear();
        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9" , "10"};
        eight.addAll(arr);
        eight1.addAll(arr);

      //  eight.compare(list);
        long start = System.nanoTime();
        eight.add("11");
        eight.add("12");
        eight.add("13");
        eight.add("14");
        eight.add("15");
        eight.add("16");
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;

        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        System.out.println("Время выполнения при добавление на 1 элемент = " + timeConsumedMillis);
        String[] testArray = {"11", "12", "13", "14", "15", "16"};
        long start1 = System.nanoTime();
        eight1.addAll(testArray);
        long finish1 = System.nanoTime();
        long timeConsumedMillis1 = finish1 - start1;
        for (String s: eight1.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        System.out.println("Время выполнения при добавление на 60% = " + timeConsumedMillis1);

        /*String[] arr = {"0", "1", "2", "3"};
        eight.addAll(arr);
        eight.addAll(arr);
        String[] array = {"5", "6", "7", "8", "9"};
        eight.addAll(array);
        eight.addAll(arr);
        for (int i = 0; i < 100; i++){
            eight.addAll(arr);
        }

        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();

       for (int i  = 0; i < 4; i ++){
            eight.add(Integer.toString(i));
        }
        eight.add("1");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.delete(3);
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.trim();
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        System.out.println(eight.size());
        eight.add("3");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.trim();
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.add("3");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();*/
       /*   eight.add("2");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.delete("3");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.add("4");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        System.out.println(eight.get(6));
       for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        eight.add("4");
        for (String s: eight.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
    */
    }
}
