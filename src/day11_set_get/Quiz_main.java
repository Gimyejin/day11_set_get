package day11_set_get;

import java.util.Scanner;

public class Quiz_main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz_set_get ex = new Quiz_set_get();
		int num = 0;
		String inputId = null;
		String inputPw = null;

		while (true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.println(">>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("���̵�: ");
				inputId = input.next();
				System.out.print("��й�ȣ: ");
				inputPw = input.next();
				if (ex.getId() == null)
					//������ �ȵǾ�������
					System.out.println("ȸ�������� ���ּ���.");
				else if (ex.getId().equals(inputId) && ex.getPw().equals(inputPw)) {
					//�α��� ����
					System.out.println("�α��� ����");
				} else if (ex.getId().equals(null))
					//�α��� ����
					System.out.println("�α��� ����");
				break;
			case 2:
				System.out.print("���� id: ");
				inputId = input.next();
				if (ex.getId() == null) {
					// ���̵� ������
					System.out.print("���� pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("���� �Ϸ�");

				} else if (ex.getId().equals(inputId)) {
					// ���̵� ���� ��
					System.out.println("�̹� ���Ե� ���̵��Դϴ�.");
				} else {
					// ���̵� ������ �ٸ���
					System.out.print("���� pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("���� �Ϸ�");
				}
				break;
			case 3:
				System.out.println("�α׾ƿ� �մϴ�.");
				;
				System.exit(1);
				;
			}

		}

	}

}
