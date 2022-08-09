package abhi.java8.le.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//Non-Functional Programming
		Map<String, Integer> abhiMap1 = new LinkedHashMap<>();
		abhiMap1.put("a", 1);
		abhiMap1.put("b", 2);
		abhiMap1.put("c", 3);
		abhiMap1.put("d", 4);
		abhiMap1.put("a", 5);
		System.out.println("abhiMap1 : "+ abhiMap1);
		System.out.println("abhiMap1.entrySet() : "+ abhiMap1.entrySet());
		System.out.println("abhiMap1.keySet() : "+ abhiMap1.keySet());
		System.out.println("abhiMap1.values() : "+ abhiMap1.values());
		System.out.println();

					//************************************Operations On Map*******************************************
		//#################### Adding ######################
		
		//Adding Single entry
		Map<String, Integer> abhiMap2 = new LinkedHashMap<>();
		abhiMap2.put("a", 1);
		System.out.println("abhiMap2 "+ abhiMap1.values());
		System.out.println();
		
		//Adding Single entries
		abhiMap1.put("a", 5);
		System.out.println("abhiMap : "+ abhiMap1);
		System.out.println();
		//Adding another map Object.
		
		
		  Map<String, Integer> map = new HashMap();
		  // if key doesn't exist, throws NullPointerException
		  map.put("count", map.get("count") + 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for() {
//			
//		}

		
//		//Functional Programming	
//		abhiMap.forEach((key, value)->System.out.println(key +" :=: "+value)); // DisAdv : we cann't perform intermediate Operations
//		System.out.println();
//		
//		System.out.println("Printing only Map's Keys");
//		abhiMap.entrySet().stream().map(e -> e.getKey()).forEach(e->System.out.println(e));
//		System.out.println();
//		
//		
//		System.out.println("Printing only Map's Values");
//		abhiMap.entrySet().stream().map(e->e.getValue()).forEach(System.out::println);
//		System.out.println();
//		
//		
//		System.out.println("Printing Map Objects after filtering :");
////		abhiMap.entrySet().stream().filter(e-> abhiMap.get(e.getKey()) %2 == 0).forEach(val->System.out.println(val));
//		abhiMap.entrySet().stream().filter(entry-> entry.getValue() %2 == 0).forEach(val->System.out.println(val));
//		System.out.println();
//		
//		abhiMap.entrySet().stream().filter(key -> key.getKey().equals("d")).forEach(key -> System.out.println(key));
//		System.out.println();
	}

}
