package makeQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeQuiz_method {
	private ArrayList<String> tvChannel = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	int num;
	int tv;

	public void setTvchannel() {
		tvChannel.add("������ ä��");
		tvChannel.add("��� ����");
		tvChannel.add("���� ����");
		tvChannel.add("����");
		tvChannel.add("sbs");
		tvChannel.add("sbs ���");
		tvChannel.add("kbs");
		tvChannel.add("kbs radio");
		tvChannel.add("kbs2");
		tvChannel.add("Ȩ����");
		tvChannel.add("mbc");
	}

	public void putIn() {
		System.out.println("��� ����: 1~11�� ä�� \t 12��: + , 13��: -");
		while (true) {
			System.out.print("������ ");
			num = input.nextInt();
			if (num != 12 && num != 13) {
				this.tv = num;
			}
			whatChannel();
		}
	}

	// num =11 tv =11�϶� ��������
	public void whatChannel() {
		if (num == 0) {
			System.out.println("tv�� �����մϴ�");
			System.exit(1);
		} else if (num == 12)
			plus();
		else if (num == 13)
			minus();

		if (tv >= 12)
			System.out.println("���� ä���� ���� ä���Դϴ�.");

		else
			System.out.println(tv + "�� ä��" + tvChannel.get(tv - 1));
		System.out.println("=================");
		

	}

	public int plus() {
		this.tv = tv + 1;
		return tv;
	}

	public int minus() {
		if (tv != 1)
			this.tv -= 1;
		else
			System.out.println("��������...");
		return tv;
	}
}
