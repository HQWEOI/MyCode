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
		System.out.println("ԭ����"+Balence);
		System.out.println("�����"+money);
		this.Balence+=money;
		System.out.println("������"+Balence);
	}
	public void quk(int money) {
		if(this.Balence-money<minBalence) {
			System.out.println("���ٱ������"+minBalence);
		}
	}
	public void seach() {
			System.out.println("�˺ţ�"  + scoreNum + "������" + name + "��ַ��" + address + " ��" + Balence);
	}
	public static void main(String[] args) {
		bankscore_3 zhang3 = new bankscore_3();
		zhang3.cunk(1000);
		zhang3.setScoreNum(10089);
		zhang3.setName("����");
		zhang3.setAddress("������");
		zhang3.seach();
		zhang3.quk(2000);
	}
}