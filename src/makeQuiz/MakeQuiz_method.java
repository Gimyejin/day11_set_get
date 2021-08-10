package makeQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeQuiz_method {
	private ArrayList<String> tvChannel = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	int num;
	int tv;

	public void setTvchannel() {
		tvChannel.add("스포츠 채널");
		tvChannel.add("드라마 재방송");
		tvChannel.add("예능 재방송");
		tvChannel.add("광고");
		tvChannel.add("sbs");
		tvChannel.add("sbs 드라마");
		tvChannel.add("kbs");
		tvChannel.add("kbs radio");
		tvChannel.add("kbs2");
		tvChannel.add("홈쇼핑");
		tvChannel.add("mbc");
	}

	public void putIn() {
		System.out.println("사용 설명서: 1~11번 채널 \t 12번: + , 13번: -");
		while (true) {
			System.out.print("리모콘 ");
			num = input.nextInt();
			if (num != 12 && num != 13) {
				this.tv = num;
			}
			whatChannel();
		}
	}

	// num =11 tv =11일때 문제가남
	public void whatChannel() {
		if (num == 0) {
			System.out.println("tv를 종료합니다");
			System.exit(1);
		} else if (num == 12)
			plus();
		else if (num == 13)
			minus();

		if (tv >= 12)
			System.out.println("지금 채널은 없는 채널입니다.");

		else
			System.out.println(tv + "번 채널" + tvChannel.get(tv - 1));
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
			System.out.println("지지지직...");
		return tv;
	}
}
