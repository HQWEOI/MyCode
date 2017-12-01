package practice_11_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practice01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("刘毅");
		list.add("王五");
		list.add("张三");
		list.add("王五");
		list.add("刘毅");
		list.add("刘毅");
		list.remove(2);
		Iterator<String> ita = list.iterator();
		while(ita.hasNext())//判断下一个元素之后有值
	     {
	         System.out.println(ita.next());
	     }
		list.add("刘甜");
		for(String Str:list) {
			System.out.println(Str);
		}
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					if(!l.contains(i)) {
						l.add(i);
					}
					if(!l.contains(j)) {
						l.add(j);
					}

				}
			}
		}
		for(int i=0;i<l.size();i++) {
			if(i>0&&l.get(i)<l.get(i-1)) {
				System.out.println("");
			}
			System.out.print(l.get(i)+" ");
			
		}
		
		

	}
}
