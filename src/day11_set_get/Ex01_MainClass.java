package day11_set_get;

public class Ex01_MainClass {

	public static void main(String[] args) {
		/*this�� Ŭ���� �ڱ� �ڽ��� ��ġ ������ �ڱ�� �ִ�
		 ��� �޼ҵ带 ����� �ڵ������� �����ȴ�.
		*/
		Ex01_This ex = new Ex01_This();
		Ex01_This ex01 = ex;//�ּҰ��� ������ ����
		
		System.out.println(ex);//��ġ ������ ��µ�
		System.out.println(ex01);
		
		ex.a=777; //func02�� 777�� ��µ�
		ex.func01();ex.func02();
	}

}
