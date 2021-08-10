package day11_set_get;

public class Ex01_MainClass {

	public static void main(String[] args) {
		/*this는 클래스 자기 자신의 위치 정보를 자기고 있다
		 멤버 메소드를 만들면 자동적으로 생서된다.
		*/
		Ex01_This ex = new Ex01_This();
		Ex01_This ex01 = ex;//주소값을 고스란히 받음
		
		System.out.println(ex);//위치 정보가 출력됨
		System.out.println(ex01);
		
		ex.a=777; //func02는 777로 출력됨
		ex.func01();ex.func02();
	}

}
