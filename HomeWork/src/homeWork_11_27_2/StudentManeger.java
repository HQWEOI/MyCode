package homeWork_11_27_2;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentManeger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		
		System.out.println("������ѧ������");
		int count = scanner.nextInt();
		
		for(int i = 0; i < count; i++) {
			
			System.out.println("����������");
			String name = scanner.next();
			System.out.println("����������");
			int age = scanner.nextInt();
			System.out.println("�������Ա�");
			String gender = scanner.next();
			System.out.println("������༶");
			String className = scanner.next();
			
			Student stu = new Student(name, age, className, gender);
			
			students.add(stu);
		}
		
		for(int i = 0; i < students.size(); i++) {
			students.get(i).traverse();
		}
		
		System.out.println("����1��������ѧ��");
		System.out.println("����2�������ѧ��");
		System.out.println("����0�˳�");
		
		int num = scanner.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("������Ҫ���ҵ�����");
			String nameSearch = scanner.next();
			boolean isFoundName = false;
			for(int i = 0; i < students.size(); i++) {
				if(students.get(i).name.equals(nameSearch)) {
					students.get(i).traverse();
					isFoundName = true;
				}
			}
			if(isFoundName == false) {
				System.out.println("û�ҵ��ó�Ա");
			}
			break;
		case 2:
			System.out.println("������Ҫ���ҵ�����");
			int ageSearch = scanner.nextInt();
			boolean isFoundAge = false;
			for(int i = 0; i < students.size(); i++) {
				if(students.get(i).age == ageSearch) {
					students.get(i).traverse();
					isFoundAge = true;
				}
			}
			if(isFoundAge == false) {
				System.out.println("û�ҵ��ó�Ա");
			}
			break;
			
		case 0:
			break;
		}
		System.out.println("�������");
	}
	
}

