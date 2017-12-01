package Practice_11_29;

public class EnumDemo {
	public static final String SPRING = "spring";
	public static final String SUMMER = "summer";
	
	public static final String MAIL = "mail";
	public static final String FEMALE = "femail";
	
public static void main(String[] args) {
		EnumGender enumGender = EnumGender.MALE;
		System.out.println(enumGender);
		
		if(enumGender == EnumGender.MALE) {
			System.out.println("==");
		}
		
		if(enumGender.equals(EnumGender.MALE)) {
			System.out.println("equal");
		}
		
		switch(enumGender) {
		case MALE:
			System.out.println("mail");
			break;
		case FEMALE:
			System.out.println("femail");
			break;
			
		}
	}
}
