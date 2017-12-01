package Practice_11_30;

import java.util.regex.Pattern;

import org.junit.Test;

public class RegularDemo {
	@Test
	public void testMatch() {
		//dnfgiufgh@gmail.com 470757517@qq.com.cn
		String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+";
		String mail = "470757517@qq.com";
		if(mail.matches(regex)) {
			System.out.println("������");
		}
		else System.out.println("��������");
		
		if(Pattern.matches(regex, mail)) {
			System.out.println("������");
		}
	}

	@Test
	public void testSplit() {
		// public String[] split(String regex)
		// ����ƥ�������������ʽ����ִ��ַ�����
		// ��β��23�������ַ������и�
		// [0-9]+ \d+
		String regex = "\\d*23";
		String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
		String[] splitArray = str.split(regex);
		for (String string : splitArray) {
			System.out.println(string);
		}
	}
	@Test
	public void testReplace() {
	   //public String replaceAll(String regex, String replacement)
	   //ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ���
	   String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
	   String result = str.replaceAll("\\d+", "#NUMBER#");
	   System.out.println(result);
	}
}



	

