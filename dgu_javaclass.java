
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dear my deer");
		System.out.println("dear my friend");
		
		int i_no = 20;
		System.out.println("Hello "+ i_no);
	}

}


****0310****
package ClassPi;

public class PiCircle {							// 클래스이름이니까 대문자로 시작
	
	public static void main(String[] args) {
		final double PI = 3.14;
		int iRadius;			//선언문
		double dCircleArea;		//선언문
	
		iRadius = 10;			//대입문			//변수 이름이니까 소문자로 시작
		iRadius = iRadius + 1;
		dCircleArea = iRadius * iRadius*PI;
												//실수*정수 연산은 실수로 계산됨
		System.out.println("반지름이 " + iRadius + "인 원의 면적은 "+ dCircleArea);
	}
}
