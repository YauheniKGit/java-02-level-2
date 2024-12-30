package com.yk.pack7Collections;

import java.util.*;

public class CollectionComparison {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("w");
        arrayList.add("c");
        arrayList.add("e");
        System.out.println("ArrayList " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("w");
        linkedList.add("c");
        linkedList.add("e");
        System.out.println("LinkedList " + linkedList);

        Deque<String> arrayDeque = new ArrayDeque<>(3);
        arrayDeque.add("a");
        arrayDeque.add("a");
        arrayDeque.add("w");
        arrayDeque.add("c");
        arrayDeque.add("e");
        System.out.println("ArrayDeque " + arrayDeque);

        //Set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("w");
        hashSet.add("c");
        hashSet.add("e");
        System.out.println("HashSet " + hashSet);

        HashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("w");
        linkedHashSet.add("c");
        linkedHashSet.add("e");
        System.out.println("LinkedHashSet " + linkedHashSet);

        Set<Object> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("w");
        treeSet.add("c");
        treeSet.add("e");
        System.out.println("TreeSet " + treeSet);

        //Map
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "a");
        hashMap.put("a", "a");
        hashMap.put("w", "w");
        hashMap.put("c", "c");
        hashMap.put("e", "e");
        System.out.println("HashMap " + hashMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "a");
        linkedHashMap.put("a", "a");
        linkedHashMap.put("w", "w");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("e", "e");
        System.out.println("LinkedHashMap " + linkedHashMap);

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("a", "a");
        treeMap.put("a", "a");
        treeMap.put("w", "w");
        treeMap.put("c", "c");
        treeMap.put("e", "e");
        System.out.println("TreeMap " + treeMap);

    }

}
