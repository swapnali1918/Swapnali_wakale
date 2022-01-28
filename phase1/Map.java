package core.programs.assissted.project;

import java.util.*;

public class Map {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		 TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();
		 
		linkedHashMap.put(1,"Mango");
		linkedHashMap.put(2,"Orange");
		linkedHashMap.put(5,"Apple");
		linkedHashMap.put(4,"Pineapple");
		linkedHashMap.put(3,"Watermelon");
		linkedHashMap.put(6,"Cherries");
		linkedHashMap.put(1,"Kiwi");
		linkedHashMap.put(8,"Plum");
		linkedHashMap.put(7,"Grapes");
		linkedHashMap.put(9,"Banana");
		
		System.out.println("****LinkedHashMap****");
		System.out.println("\n");
		System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
		
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        
        System.out.println("Remove 4th and 7th Fruit : " +linkedHashMap.remove(4) +" "+linkedHashMap.remove(7));
        System.out.println("After Removing 4th and 7th Fruit in LinkedHashMap : " + linkedHashMap);
        System.out.println("LinkedHashMap contains Banana and Apple as value? : " + linkedHashMap.containsValue("Banana")+" "+linkedHashMap.containsValue("Apple"));
        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
       System.out.println("HashCode of LinkedHashmap : "+linkedHashMap.hashCode());
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
        
        System.out.println("****TreeMap****");
        System.out.println("\n");
        TreeMap.put(1,"Mango");
        TreeMap.put(2,"Orange");
        TreeMap.put(5,"Apple");
        TreeMap.put(4,"Pineapple");
        TreeMap.put(3,"Watermelon");
        TreeMap.put(6,"Cherries");
        TreeMap.put(1,"Kiwi");
        TreeMap.put(8,"Plum");
        TreeMap.put(7,"Grapes");
        TreeMap.put(9,"Banana");
		
		System.out.println("Contents of TreeMap : " + TreeMap);
		
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : TreeMap.keySet()) {
            System.out.println(key + ":\t" + TreeMap.get(key));
        }
        
        System.out.println("Remove 4th and 7th Fruit : " +TreeMap.remove(4) +" "+TreeMap.remove(7));
        System.out.println("After Removing 4th and 7th Fruit in TreeMap : " + TreeMap);
        System.out.println("TreeMap contains Banana and Apple as value? : " + TreeMap.containsValue("Banana")+" "+TreeMap.containsValue("Apple"));
        System.out.println("TreeMap contains 4 as key? : " + TreeMap.containsKey(4));
        System.out.println("HashCode of TreeMap : "+TreeMap.hashCode());
        TreeMap.clear();
        System.out.println("\nContent of TreeMap after clearing: " + TreeMap);
	}

}
