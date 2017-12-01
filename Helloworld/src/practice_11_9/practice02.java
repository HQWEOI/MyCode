package practice_11_9;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class practice02 {
	 public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("nihao");
		list.add("wohao");
		list.add("dajiaohao");
		list.add("nihao");
		list.set(1, "tahao");
		Iterator<String> ita = list.iterator();
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i)=="nihao") {
				list.set(i, "nibuhao");
			}
		}
		
	}
}
