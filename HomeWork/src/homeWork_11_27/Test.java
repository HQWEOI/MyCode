package homeWork_11_27;

public class Test {
	public static void main(String[] args) {
		AbstractPerson stu =  new Student("张三",18);
		stu.showInfo();
		
		AbstractPerson stu2 = new SmokingStudent("李四",18);
		stu2.showInfo();
		
		SmokingStudent stu3 = new SmokingStudent("王五", 18);
		stu3.showInfo();
		stu3.smoke();
		stu3.study();
		
		AbstractPerson teacher =  new Teacher("李六",38);
		teacher.showInfo();
		Teacher teacher2 = new Teacher("老七",38);
		teacher2.showInfo();
		teacher2.teach();
		
		SmokingTeacher teacher3 = new SmokingTeacher("黄八", 18);
		teacher3.showInfo();
		teacher3.smoke();
		teacher3.teach();
		
		SmokingBikingTeacher teacher4 = new SmokingBikingTeacher("黄八", 18);
		teacher4.showInfo();
		teacher4.smoke();
		teacher4.teach();
		teacher4.bike();
		
	}
}
