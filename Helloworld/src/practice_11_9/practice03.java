package practice_11_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class practice03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("1", 18);
		map.put("2", 18);
		map.put("3", 14);
		map.put("4", 18);
		map.put("5", 19);
		map.put("6", 15);
		map.put("7", 17);
		int temp;
		for (Entry<String, Integer> entry : map.entrySet()) {
		       System.out.println("—ß∫≈= " + entry.getKey() + " ƒÍ¡‰= " + entry.getValue());
		  }
		for (Entry<String, Integer> entry : map.entrySet()) {
		      if(entry.getValue().equals("18")) {
		    	  System.out.println("—ß∫≈= " + entry.getKey());
		      }
		  }
		int temp1=99;
		for (Entry<String, Integer> entry : map.entrySet()) {
		      temp1 = temp1>entry.getValue()?entry.getValue():temp1;
		  }
		for (Entry<String, Integer> entry : map.entrySet()) {
		      if(temp1==entry.getValue()) {
		    	  System.out.println(entry.getKey());
		      }
		  }
		
		
	}
}
