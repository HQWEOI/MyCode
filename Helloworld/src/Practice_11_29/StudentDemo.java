package Practice_11_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class StudentDemo {

	@Test
	public void test() {
	    List<Student> list = new ArrayList<Student>();
	    Scanner scanner = new Scanner(System.in);
	    while (true) {
	       System.out.println("请输入学生姓名");
	       String name = scanner.next();
	       System.out.println("请输入学生年龄");
	       int age = scanner.nextInt();
	       System.out.println("请输入性别：0-女 1-男");
	       int gender = scanner.nextInt();
	       EnumGender enumGender = null;
	       if (gender == 0) {
	           enumGender = EnumGender.FEMALE;
	       } else {
	           enumGender = EnumGender.MALE;
	       }
	       Student student = new Student(name, age, enumGender);
	       list.add(student);
	       System.out.println("输入0退出，其他继续");
	       int type = scanner.nextInt();
	       if (type == 0) {
	           break;
	       }
	    }
	    
	    for (Student student : list) {
	       //System.out.println(student);
	       switch (student.getEnumGender()) {
	       case MALE:
	           System.out.println(student.getName() + "是："
	                  + student.getEnumGender().getValue() + " 需要参加劳动");
	           break;
	       case FEMALE:
	           System.out.println(student.getName() + "是："
	                  + student.getEnumGender().getValue() + " 不需要参加劳动");
	           break;
	       default:
	           break;
	       }
	    }
	}
}
