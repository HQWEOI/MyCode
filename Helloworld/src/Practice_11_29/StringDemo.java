package Practice_11_29;

import org.junit.Test;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//比较内容是否相同
		
		if(str1.equals(str2)) {
			System.out.println("equals");
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("equalsIgnoreCase");
		}
		
		// == 内存地址是不是相等 就是看两个变量是不是在指向堆new出来相同对象
		
		if(str1 == str2) {
			System.out.println("==");
		}
		
		

		}
		@Test
		public void test1() {
			String str1 = "abc";
			String str2 = new String("abc");
			String str3 = "abc";
			if(str1 == str3) {
				System.out.println("==");
			}
		}
		
		
		private void StringDemo() {
			// TODO Auto-generated method stub
			
		}
		@Test
		public void test2() {
			String str = "java AndroidA";
			System.out.println(str.length());
			System.out.println(str.charAt(5));
			System.out.println(str.indexOf("f"));  //如果没有返回-1
			System.out.println(str.lastIndexOf("A"));
			
			System.out.println(str.indexOf("A",7));
		}
		
		@Test
		public void test3() {
			String str = "java Adroid";
			System.out.println(str.contains("And"));
			System.out.println(str.startsWith("ja"));
			
		}
		
		@Test
		public void test4() {
//			String str = "java Android";
			char[] array = {'j' , 'a' , 'v' ,'a'};
			
			String str = new String(array);
			
			System.out.println(str);
			
			char[] charArray = str.toCharArray();
			
			for(char c: charArray) {
				System.out.println(c);
			}
		}
		
		@Test
		public void test5() {
			String str = "java Android";
			
			System.out.println(str.replace("A", "B"));  //字符串里A全部换为B
			
		}
		
		@Test
		public void test6() {
			String str = "java Android"; 
			String[] array = str.split(" ");   //通过某个字符分割字符串
			for(String string : array) {
				System.out.println(string);
			}
		}
		
		@Test
		public void test7() {
			String str = "java Android"; 
			System.out.println(str.substring(5));  //Android
			System.out.println(str.substring(5, 8));	//And
		}
		@Test
		public void test8() {
			String str = " java Android "; 
			System.out.println(str); 
			System.out.println(str.trim());  //去掉字符串首尾空格
			
			}
		@Test
		public void test9() {
			String str = "---java Adroid---"; 
			String strResault = trim(str);		
			System.out.println(strResault);
			}
		
		private String trim(String str) {
			int beginIndex = 0;
			int endIndex = str.length() - 1;
			while(beginIndex <= endIndex && str.charAt(beginIndex)=='-') {
				beginIndex++;
			}
			while(beginIndex <= endIndex && str.charAt(endIndex)=='-') {
				endIndex--;
			}
			str = str.substring(beginIndex, endIndex +1);
			return str;
			
		}
		
		@Test
		public void test10() {
			String str = "---java Adroid---1"; 
			String str1 = "---java Adroid---2"; 
			String str2 = "---java Adroid---3";
			
			StringBuilder  builder1 = new StringBuilder();
			builder1.append(str);
			
			//链式编程
			StringBuilder builder = new StringBuilder();
			builder.append(str).append(str1).append(str2);
			System.out.println(builder);
			
			StringBuffer buffer = new StringBuffer(str1);
			buffer.append(str1);
			buffer.append(str2);
			
			String string = "java" + "ios";
		
		}
		
		
		
		
	}
		
