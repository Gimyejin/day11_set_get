package makeQuiz;

import java.util.Scanner;

class MakeQuiz2_method {
	Scanner input = new Scanner(System.in);
	int num;
	int charging = 0;
	boolean fin = false;

	public void onoff() {
		System.out.println("1.on 2.off\n>>>");
		num = input.nextInt();
		switch (num) {
		case 1:
			setCharging();
		case 2:
			System.exit(1);
		}
	}

	public void setCharging() {
		while (true) {
			System.out.println("<< 1.20�� 2.40�� 3.60�� 4.80�� 5.100�� >>");
			System.out.print("[�� ���� �����Ͻðڽ��ϱ�?]");
			num = input.nextInt();
			switch (num) {
			case 1:
				charging += 20;
				break;
			case 2:
				charging += 40;
				break;
			case 3:
				charging += 60;
				break;
			case 4:
				charging += 80;
				break;
			case 5:
				charging += 100;
				break;
			}
			getCharging();
			if (fin == true)
				onoff();
		}
	}

	public void getCharging() {
		if (charging > 100) {
			System.out.println("�Է��� �ʰ��Ͽ����ϴ�.");
			System.out.println("100% ���� �Ϸ�");
			charging = 100;
			fin = true;
		} else {
			System.out.println(charging + "% ���� �Ϸ��Ͽ����ϴ�.");
		}
	}
}

public class MakeQuiz2 {

	public static void main(String[] args) {
		MakeQuiz2_method ex = new MakeQuiz2_method();
		ex.onoff();
	}

}
