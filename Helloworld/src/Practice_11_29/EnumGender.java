package Practice_11_29;

public enum EnumGender {
    //���������Ĺ��췽��
	MALE("��"),FEMALE("Ů");
    
    private String value;
    
    //The constructor EnumGender(String) is undefined
    //Illegal modifier for the enum constructor; only private is permitted.
    private EnumGender() {
      }
    private EnumGender(String value) {
       this.value = value;
    }
    private EnumGender(String value,String value2) {
        this.value = value;
     }
    
    public String getValue() {
       return value;
    }
    }
    

