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
		System.out.print("학원 입력: ");
		academy = input.next();
		this.academy = academy;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.print("성명 입력: ");
		name = input.next();
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber() {
		System.out.print("회원 번호 입력: ");
		number = input.next();
		this.number = number;
	}
	public void print() {
		System.out.println(getName()+"님의 학원은 \""+getAcademy()+"\" 입니다");
		System.out.println(getNumber()+"님의 회원 번호입니다.");
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
