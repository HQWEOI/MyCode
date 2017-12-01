package Practice_11_28;
import java.util.*;
import java.util.Map.Entry;  
public class Practice_1 {  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		int[] array = new int[count];
		
		for(int i = 0; i < count; i++) {
			array[i] = scan.nextInt();
		}
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
		for(int i = 0; i < count; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		
		class ValueComparator implements Comparator<Map.Entry<Integer, Integer>>{

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
			
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
		
		}  
	}
}  


