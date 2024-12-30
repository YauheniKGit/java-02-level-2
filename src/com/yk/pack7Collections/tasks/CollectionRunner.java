package com.yk.pack7Collections.tasks;

import java.util.*;

public class CollectionRunner {


    public static void main(String[] args) {

        CollectionRunner collectionRunner = new CollectionRunner();
        collectionRunner.task3Comparator();


    }

    private void task1IteratorArrayVSLinked() {

        List<Integer> arrayList = new ArrayList<>();

        //add arrayList
        long currentTimeMillisStart = System.currentTimeMillis();

        for (int i = 1000000; i != 0; i--) {
            arrayList.add(new Random().nextInt(20));
        }

        long currentTimeMillisFinish = System.currentTimeMillis();

        System.out.println(" //add arrayList: " + (currentTimeMillisFinish - currentTimeMillisStart));

        //delete arrayList
        long currentTimeMillisStartDelete = System.currentTimeMillis();

        for (int i = 1000000 - 1; i != 0; i--) {
            arrayList.remove(i);
        }

        long currentTimeMillisFinishDelete = System.currentTimeMillis();

        System.out.println(" //remove arrayList: " + (currentTimeMillisFinishDelete - currentTimeMillisStartDelete));


        //add linkedList
        List<Integer> linkedList = new LinkedList<>();

        long currentTimeMillisStart1 = System.currentTimeMillis();

        for (int i = 1000000; i != 0; i--) {
            linkedList.add(new Random().nextInt(20));
        }

        long currentTimeMillisFinish2 = System.currentTimeMillis();

        System.out.println(" //add linkedList: " + (currentTimeMillisFinish2 - currentTimeMillisStart1));

        //delete linkedList
        long currentTimeMillisStartDelete2 = System.currentTimeMillis();

        for (int i = 1000000 - 1; i != 0; i--) {
            linkedList.remove(i);
        }

        long currentTimeMillisFinishDelete2 = System.currentTimeMillis();

        System.out.println(" //remove linkedList: " + (currentTimeMillisFinishDelete2 - currentTimeMillisStartDelete2));


        Iterator<Integer> iterator = linkedList.iterator();

//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 == 0) {
//                iterator.remove();
//            }
//        }

//        Set<Integer> treeSet = new TreeSet<>(arrayList);

//        System.out.println(treeSet);


    }

    private void task2MapCountDuplicates() {

        List<Integer> integers = List.of(10, 1, 4, 5, 6, 25, 1, 4);

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer element : integers) {
            integerMap.put(element, element);
        }

        System.out.println(integers.size() - integerMap.size());

    }

    private void task3Comparator() {

        User user1 = new User("Zaur", 38);
        User user2 = new User("Jack", 21);
        User user3 = new User("Sam", 49);
        User user4 = new User("Tom", 18);
        User user5 = new User("Alex", 33);
        User user6 = new User("Alex", 33);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        users.sort(new UserComparatorAge().reversed().thenComparing(new UserComparatorName()));

        System.out.println(users);




    }


}
