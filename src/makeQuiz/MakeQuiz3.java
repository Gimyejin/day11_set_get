package makeQuiz;

import java.util.Scanner;

class MakeQuiz3_method{
	private String academy;
	private String name;
	private String number;
	
	Scanner input = new Scanner(System.in);
	
	public String getAcademy() {
		return academy;
	}
	public void setAcademy() {
		System.out.print("�п� �Է�: ");
		academy = input.next();
		this.academy = academy;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.print("���� �Է�: ");
		name = input.next();
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber() {
		System.out.print("ȸ�� ��ȣ �Է�: ");
		number = input.next();
		this.number = number;
	}
	public void print() {
		System.out.println(getName()+"���� �п��� \""+getAcademy()+"\" �Դϴ�");
		System.out.println(getNumber()+"���� ȸ�� ��ȣ�Դϴ�.");
	}
}

public class MakeQuiz3 {

	public static void main(String[] args) {
		MakeQuiz3_method ex = new MakeQuiz3_method();
		ex.setAcademy();;
		ex.setName();;
		ex.setNumber();;
		ex.print();
	}

}
