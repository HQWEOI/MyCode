package practice_11_23;

import java.util.Scanner;

public class StudentMannerger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ������");
		int count = scanner.nextInt();
		
		Student[] students = new Student[count];
		
		inputStudents(scanner, students);
		
		traverseStudents(students);
		
		StudentManager(scanner, students);
	}

	private static void StudentManager(Scanner scanner, Student[] students) {
		System.out.println("����1����ѧ��");
		System.out.println("����0�˳�");
		
		int num = scanner.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("������Ҫ���ҵ�����");
			String nameSearch = scanner.next();
			boolean isFoundName = false;
			for(int i = 0; i < students.length; i++) {
				if(students[i].name.equals(nameSearch)) {
					students[i].traverse();
					isFoundName = true;
				}
			}
			if(isFoundName == false) {
				System.out.println("û�ҵ��ó�Ա");
			}
			break;
		case 0:
			break;
		}
		System.out.println("���ҽ���");
	}

	private static void inputStudents(Scanner scanner, Student[] students) {
		for(int i = 0; i < students.length; i++) {
			
			System.out.println("����������");
			String name = scanner.next();
			System.out.println("����������");
			int age = scanner.nextInt();
			System.out.println("�������Ա�");
			String gender = scanner.next();
			System.out.println("������༶");
			String className = scanner.next();
			
			Student Student = new Student(name, age, className, gender);
			students[i] = Student;
		}
	}

	private static void traverseStudents(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			students[i].traverse();
		}
	}

	private static void SeachByName(Scanner scanner, Student[] students) {
		System.out.println("������Ҫ���ҵ�����");
		String nameSearch = scanner.next();
		boolean isFoundName = false;
		for(int i = 0; i < students.length; i++) {
			if(students[i].name.equals(nameSearch)) {
				students[i].traverse();
				isFoundName = true;
			}
		}
		if(isFoundName == false) {
			System.out.println("û�ҵ��ó�Ա");
		}
	}	
}