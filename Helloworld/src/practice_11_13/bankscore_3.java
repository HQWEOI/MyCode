package practice_11_13;

public class bankscore_3 {
	int scoreNum;
	String name;
	String address;
	int Balence = 0;
	int minBalence = 1;
	public void setScoreNum(int scoreNum) {
		this.scoreNum = scoreNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void cunk(int money) {
		System.out.println("原有余额："+Balence);
		System.out.println("存入金额："+money);
		this.Balence+=money;
		System.out.println("现有余额："+Balence);
	}
	public void quk(int money) {
		if(this.Balence-money<minBalence) {
			System.out.println("至少保留余额"+minBalence);
		}
	}
	public void seach() {
			System.out.println("账号："  + scoreNum + "姓名：" + name + "地址：" + address + " 余额：" + Balence);
	}
	public static void main(String[] args) {
		bankscore_3 zhang3 = new bankscore_3();
		zhang3.cunk(1000);
		zhang3.setScoreNum(10089);
		zhang3.setName("张三");
		zhang3.setAddress("朝阳区");
		zhang3.seach();
		zhang3.quk(2000);
	}
}
