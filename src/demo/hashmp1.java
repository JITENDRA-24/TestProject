package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmp1 {
public static void main(String[] args) {
	// NO Ordering ==> NO Indexing
	// Store value --> key, value <k,v>
	// key cannot be duplicate
	// Can store n number of null values but only one null key
	// HashMap is not thread safe ==> Unsynchronized 
	
	HashMap<String, String> hm = new HashMap<String, String>();
	
	hm.put("India", "Delhi");
	hm.put("Manual", "JITENDRA");
	hm.put("Automation", null);
	hm.put("Api", null);
	hm.put("Api", "santo");
	hm.put(null, "Pradip");
	hm.put(null, "Pujgire");
	
	hm.remove("India");
	hm.replace("Manual", "Pune");
	
	System.out.println(hm);
	System.out.println(hm.isEmpty());
	System.out.println(hm.size());
	System.out.println(hm.get("India"));
	System.out.println(hm.get("Api"));
	System.out.println(hm.get(null));
	System.out.println("================================");
	
	// Iterator: over the keys: by using keyset()
	Iterator<String> it = hm.keySet().iterator();
	while(it.hasNext()) {
		
		String key = it.next();
		String value = hm.get(key);
		System.out.println("key: "+ key +",  "+"Value: "+value);
	}
	System.out.println("----------------------------------------------"); 
	
	// Iterator: over the set (pair): by using entryset
	Iterator<Entry<String, String>> it1 = hm.entrySet().iterator();
	while(it1.hasNext())
	{
	Entry<String, String> entry = it1.next();
     System.out.println("Key: "+entry.getKey()+", "+"Value: "+entry.getValue());
	}
   System.out.println("================================");
   
	// Iterator by using java 8 for each and lambda:
	hm.forEach((k,v) -> System.out.println("key= "+k+" "+"Value= "+v));
	
}
}
