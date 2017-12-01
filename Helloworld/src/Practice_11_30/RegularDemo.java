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
			System.out.println("是邮箱");
		}
		else System.out.println("不是邮箱");
		
		if(Pattern.matches(regex, mail)) {
			System.out.println("是邮箱");
		}
	}

	@Test
	public void testSplit() {
		// public String[] split(String regex)
		// 根据匹配给定的正则表达式来拆分此字符串。
		// 结尾是23的数字字符串来切割
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
	   //使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
	   String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
	   String result = str.replaceAll("\\d+", "#NUMBER#");
	   System.out.println(result);
	}
}



	

