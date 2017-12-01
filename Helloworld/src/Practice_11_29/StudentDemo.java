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
	       System.out.println("������ѧ������");
	       String name = scanner.next();
	       System.out.println("������ѧ������");
	       int age = scanner.nextInt();
	       System.out.println("�������Ա�0-Ů 1-��");
	       int gender = scanner.nextInt();
	       EnumGender enumGender = null;
	       if (gender == 0) {
	           enumGender = EnumGender.FEMALE;
	       } else {
	           enumGender = EnumGender.MALE;
	       }
	       Student student = new Student(name, age, enumGender);
	       list.add(student);
	       System.out.println("����0�˳�����������");
	       int type = scanner.nextInt();
	       if (type == 0) {
	           break;
	       }
	    }
	    
	    for (Student student : list) {
	       //System.out.println(student);
	       switch (student.getEnumGender()) {
	       case MALE:
	           System.out.println(student.getName() + "�ǣ�"
	                  + student.getEnumGender().getValue() + " ��Ҫ�μ��Ͷ�");
	           break;
	       case FEMALE:
	           System.out.println(student.getName() + "�ǣ�"
	                  + student.getEnumGender().getValue() + " ����Ҫ�μ��Ͷ�");
	           break;
	       default:
	           break;
	       }
	    }
	}
}
