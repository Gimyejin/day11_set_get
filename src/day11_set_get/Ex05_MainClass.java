package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		int k = 100, e = 90, m = 80;
		// ��ü ���� �� ������ ��(kor,eng,math,sum,avg)�� �����Ͻÿ�
		// ���
		Ex05_set_get ex = new Ex05_set_get();
		ex.setK(k);
		ex.setE(e);
		ex.setM(m);
		ex.setSum();
		ex.getAvg();
		
		ex.print();
	}

}
