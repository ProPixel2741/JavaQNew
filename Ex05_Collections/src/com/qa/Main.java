package com.qa;

import com.qa.model.Animal;
import com.qa.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running?");

        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        //ArrayLists
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);
        for (int x = 0; x < animalList.size(); x++) {
            System.out.println(animalList.get(x));
        }

        //HashMaps Key-Value Pairs
        HashMap<String, Animal> animalMap =
                new HashMap<String, Animal>();
        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        //2nd HashMap with Objects and Description
        HashMap<Animal, String> animalMap2
                = new HashMap<>();
        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure");

        for (String key : animalMap.keySet()) {
            System.out.println("2nd Map: Key: " + key +
                    " Value: " + animalMap.get(key));
        }

        //HashSet
        HashSet<Animal> set = new HashSet<>();
        set.addAll(animalList);
        set.add(c); //duplicates not allowed
        set.add(c2); //duplicates not allowed
        set.add(c2); //duplicates not allowed
        Iterator<Animal> iter = set.iterator();
        System.out.println("HashSet: ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Finding Spot");
        for (Animal a : animalList) {
            if (a.getName().equals("Spot")) {
                System.out.println(
                        "Found Spot in the ArrayList: " + a
                );
            }
        }

        System.out.println("Found Spot in the HashMap: " +
                animalMap.get("Spot"));

        Collections.sort(animalList);
        System.out.println("Sorted animal list");
        for (int x = 0; x < animalList.size(); x++) {
            System.out.println(animalList.get(x));
        }
        //you can't sort() Set or HashMap, they have no order

        //TreeMap
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);
        System.out.println("TreeMap");
        for (String key : tree.keySet()) {
            System.out.println("Key: " + key + " Value: " +
                    tree.get(key));
        }
    }
}
