package test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test04 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����");
	     list.add("World");
	     list.add("HAHAHAHA");
	     Iterator<String> ite=list.iterator();
	     while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
	     {
	         System.out.println(ite.next());
	     }
	}
}

