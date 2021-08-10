package day11_set_get;

public class Ex03_set_get {
	// 정보 은닉
	private int num;
	private int age;
	private String name;

	// 현재 함수들 이름에 통일성이 없음. <-함수 이름이 func, age01,mymine 이랬었음
	// 그래서 set을 넣어 통일성을 만듬
	// private 변수를 쓰는(접근하는) 함수의 이름은 set을 넣어 사용하자(java의 규칙임)
	// 합성어의 첫번째 이름은 대문자로 ex) setName
	// set은 대입
	// 값을 가져올때는 get <- 변수가 private이니깐 직접적으로 이용 못함
	
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
