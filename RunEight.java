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
        for (int i = 0; i < 100; i++){
            eight.add(Integer.toString(i));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнения при добавление 100 элементов по 1-му элементу = " + timeConsumedMillis);

        String[] testArray = new String[100];
        for (int i = 0; i < testArray.length; i++ ){
            testArray[i] = Integer.toString(i);
        }
        long start1 = System.nanoTime();
        eight1.addAll(testArray);
        long finish1 = System.nanoTime();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Время выполнения при добавление на 60% = " + timeConsumedMillis1);

        eight.clear();
        String[] arrFor10000 = {"1", "2", "3", "4", "5", "6", "7", "8", "9" , "10"};
        eight.addAll(arrFor10000);
        eight1.addAll(arrFor10000);

        long startFor10000Elemen = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            eight.add(Integer.toString(i));
        }
        long finishFor10000Elemen = System.nanoTime();
        long timeConsumedMillisFor10000Elemen = finishFor10000Elemen - startFor10000Elemen;
        System.out.println("Время выполнения при добавление 10000 элементов по 1-му элементу = " + timeConsumedMillisFor10000Elemen);

        String[] testArrayFor10000 = new String[10000];
        for (int i = 0; i < testArrayFor10000.length; i++ ){
            testArrayFor10000[i] = Integer.toString(i);
        }
        long startFor10000AddArray = System.nanoTime();
        eight1.addAll(testArrayFor10000);
        long finishFor10000AddArray = System.nanoTime();
        long timeConsumedMillisFor10000AddArray = finishFor10000AddArray - startFor10000AddArray;
        System.out.println("Время выполнения при добавление на 60% = " + timeConsumedMillisFor10000AddArray);

        eight.clear();
        String[] arrFor1000000 = {"1", "2", "3", "4", "5", "6", "7", "8", "9" , "10"};
        eight.addAll(arrFor1000000);
        eight1.addAll(arrFor1000000);

        long startFor1000000Elemen = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            eight.add(Integer.toString(i));
        }
        long finishFor1000000Elemen = System.nanoTime();
        long timeConsumedMillisFor1000000Elemen = finishFor1000000Elemen - startFor1000000Elemen;
        System.out.println("Время выполнения при добавление 1000000 элементов по 1-му элементу = " + timeConsumedMillisFor1000000Elemen);

        String[] testArrayFor1000000 = new String[1000000];
        for (int i = 0; i < testArrayFor1000000.length; i++ ){
            testArrayFor1000000[i] = Integer.toString(i);
        }
        long startFor1000000AddArray = System.nanoTime();
        eight1.addAll(testArrayFor1000000);
        long finishFor1000000AddArray = System.nanoTime();
        long timeConsumedMillisFor1000000AddArray = finishFor1000000AddArray - startFor1000000AddArray;
        System.out.println("Время выполнения при добавление на 60% = " + timeConsumedMillisFor1000000AddArray);

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
