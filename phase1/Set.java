package core.programs.assissted.project;


import java.util.*;

class Set{
	public static void main(String[] args){
		
		
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		
		hs.add("Mango");
		hs.add("Orange");
		hs.add("Apple");
		hs.add("Pineapple");
		hs.add("Watermelon");
		hs.add("Cherries");
		hs.add("Kiwi");
		hs.add("Plum");
		hs.add("Grapes");
		hs.add("Banana");
				
		System.out.println("****Hashset****");
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		hs.add("Guava");
		hs.add("Pear");
		hs.add("Mulberry");
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		System.out.println("Does hashset contains this 'Orange' element  " + hs.contains("Orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		
		
		//LinkHashSet
		
		ls.add("Mango");
		ls.add("Orange");
		ls.add("Apple");
		ls.add("Pineapple");
		ls.add("Watermelon");
		ls.add("Cherries");
		ls.add("Kiwi");
		ls.add("Plum");
		ls.add("Grapes");
		ls.add("Banana");
		
		System.out.println("\n");
		System.out.println("****LinkHashset****");
		System.out.println("LinkHashset is "+ls);
		System.out.println("Size of LinkHashset is "+ ls.size());
		ls.add("Guava");
		ls.add("Pear");
		ls.add("Mulberry");
		//ls.add(null);
		System.out.println("LinkHashset is "+ls);
		System.out.println("Size of LinkHashset is "+ ls.size());
		System.out.println("Does Linkhashset contains this 'Orange' element  " + ls.contains("Orange"));		
		System.out.println("is Linkhashset empty  " + ls.isEmpty());
		//System.out.println("remove the element "+hs.remove("i"));
		System.out.println("\n");   
		System.out.println("****Treeset****");
		ts.add("Mango");
		ts.add("Orange");
		ts.add("Apple");
		ts.add("Pineapple");
		ts.add("Watermelon");
		ts.add("Cherries");
		ts.add("Kiwi");
		ts.add("Plum");
		ts.add("Grapes");
		ts.add("Banana");
		
	
		System.out.println("Treeset is "+ts);
		System.out.println("Size of Treeset is "+ ts.size());
		ts.add("Guava");
		ts.add("Pear");
		ts.add("Mulberry");
		//ls.add(null);
		System.out.println("Treeset is "+ts);
		System.out.println("Size of Treeset is "+ ts.size());
		System.out.println("Does Treeset contains this 'Orange' element  " + ts.contains("Orange"));		
		System.out.println("is Treeset empty  " + ts.isEmpty());
		//System.out.println("remove the element "+hs.remove("i"));
	  	}
}