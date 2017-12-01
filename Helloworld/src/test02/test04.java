package test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test04 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("哈哈");
	     list.add("World");
	     list.add("HAHAHAHA");
	     Iterator<String> ite=list.iterator();
	     while(ite.hasNext())//判断下一个元素之后有值
	     {
	         System.out.println(ite.next());
	     }
	}
}

