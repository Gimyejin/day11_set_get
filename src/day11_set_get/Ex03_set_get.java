package day11_set_get;

public class Ex03_set_get {
	// ���� ����
	private int num;
	private int age;
	private String name;

	// ���� �Լ��� �̸��� ���ϼ��� ����. <-�Լ� �̸��� func, age01,mymine �̷�����
	// �׷��� set�� �־� ���ϼ��� ����
	// private ������ ����(�����ϴ�) �Լ��� �̸��� set�� �־� �������(java�� ��Ģ��)
	// �ռ����� ù��° �̸��� �빮�ڷ� ex) setName
	// set�� ����
	// ���� �����ö��� get <- ������ private�̴ϱ� ���������� �̿� ����
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	

	public void print() {
		System.out.println("num: " + num);
	}

}
