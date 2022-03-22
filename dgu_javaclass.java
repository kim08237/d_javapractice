/*
자바는 독립적, 자바 가상 기계는 종속적(JVM, Java virtual machine)

###프로젝트 이름 중요해### 프로젝트 이름 띄어쓰기 못하니 대문자쓰거나 언더바(_)써

클래스 이름 정할 때 중요한 것: 첫글자 대문자. 클래스가 아닌 것은 소문자로 시작

//는 주석을 뜻해

"______"는 문자열(string), ' '는 문자 하나(char)
    문자열인데 작은따옴표 ' '쓰면 오류떠. invalid character constnat

클래스이름, 프로젝트이름 등 한글 사용 가능하나 전세계 개발자들이 그렇게 안하니 걍 대문자로 시작해
overloading 시험문제다

하나의 소스 파일에 여러 클래스 작성 가능하나 여러개는 비추고 하나만 작성 추천.컴파일된 클래스 파일에는 클래스는 하나만 존재.
    
클래스는 첫문자 대문자로시작. 변수/메소드는 시작은 소문자 첫단어 이후 각 단어의 첫먼쨰문자 대문자로

셤문제)) 생성자의 특징 세가지를 쓰시오

break는 자신을 갑싸고 있는 '반복문' 하나만 빠져나온다

*/















------------------------40줄 시작----------------------------
차례
(51)  0307
(66)  0310 원의 넓이 구하기
(85)  0314 Scanner
(122) 0314 홀짝
(153) 0314 3의배수/10~20 출력
(183) 0317 scan으로 정수 합 구하기
(229) 0321 메뉴 주문받기
-------------------------------------------------------------

****0307****
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dear my deer");
		System.out.println("dear my friend");
		
		int i_no = 20;
		System.out.println("Hello "+ i_no);
	}

}


****0310 원의 넓이 구하기****
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


****0314 Scanner****
import java.util.Scanner;

public class Practice {

	public static void main(String args[]) {
	
		System.out.println("이름, 나이, 체중, 독신 여부를 입력하세요.");
		
		Scanner myScanner;				//스캐너 지정
		String mName;
		int mAge;
		double mWeight;
		boolean mSingle;
		
		
		myScanner = new Scanner(System.in);		//스캐너 이름 지정
		System.out.print("이름을 입력하세요: ");	 
		mName = myScanner.nextLine();			// . 앞에 스캐너 이름 써줘야 해
							//띄어쓰기까지 입력받는거
		System.out.print("나이를 입력하세요: ");
		mAge = myScanner.nextInt();
		
		System.out.print("체중을 입력하세요: ");
		mWeight = myScanner.nextDouble();
		
		System.out.print("독신 여부를 입력하세요(True/False로 입력): ");
		mSingle = myScanner.nextBoolean();
		
		
		System.out.print("이름은 " + mName + ", ");
		System.out.print("나이는 " + mAge + "세, ");
		System.out.print("체중은 " + mWeight + "kg, ");
		System.out.print("독신 여부는 " + mSingle + "입니다. ");
		
		myScanner.close();		//scanner 했으면 꼭 close 해야 해
	}

}

****0314 홀짝****
import java.util.Scanner;

public class Cls_OddEven {

	public static void main(String args[]) {
		
	System.out.print("정수를 입력하세요: ");
	
	Scanner oddScanner;
	int number, module;				//if문에 number%2==0 하지말고 나머지 변수를 따로 지정하자
	
	oddScanner = new Scanner(System.in);
	number = oddScanner.nextInt();
	
	module = number%2;
	
	if (module == 0) {				//조건식에 연산식 넣지 말자!!위에처럼 변수 따로 지정
		System.out.print(number + "는(은) 짝수입니다.");
	} else {
		System.out.print(number+ "는(은) 홀수입니다.");
	}
	
	oddScanner.close();
	}
	
}

****0314 3의배수/10~20 출력****
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner myScanner;
		int number;
		int divThree;
		
		myScanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		number = myScanner.nextInt();
		
		divThree = number %3;
		
		if (divThree == 0) {
			if (10 < number && number <20) {
				System.out.println(number + "는 3의 배수이며 10과 20 사이 숫자입니다.");
			}
			else System.out.println(number + "는 3의 배수이나 10~20 사이 숫자가 아닙니다.");
		}
		else System.out.println(number + "는 3의 배수도 아니고 10~20 사이 숫자도 아닙니다.");
		
		myScanner.close();		//scanner 했으면 꼭 close 해야 해
	}

}

****0317 정수계산****
import java.util.Scanner;

//두 자리 수인 두 정수를 입력받고 +연산을 압력받을때만 결과값 출력하는 프로그램

public class Practice {
	public static void main(String [] args) {
		
		Scanner plusScanner;								//스캐너 지정하면 꼭 스캐너 닫아줘
		
		int number1, number2, iResult;						//변수들 선언
		String inputOper;
		String fiveOper = "+-*/%";
		char plusOper;
		Boolean whatNum1, whatNum2;
		
		
		plusScanner = new Scanner(System.in);				//스캐너 선언
		
		System.out.println("입력할 정수와 연산자를 입력하세요");
		number1 = plusScanner.nextInt();					//정수랑 연산자 입력받기
		inputOper = plusScanner.next();
		number2 = plusScanner.nextInt();
		
		plusOper = fiveOper.charAt(0);						//char는 작은따옴표로 표시
		iResult = 0;										//결과값 초기화해줘야 오류안생김
		
		whatNum1 = 10 <= number1 && number1 < 100;			//정수가 모두 두 자리 수인지 알아봄
		whatNum2 = 10 <= number2 && number2 < 100;
		
		if (whatNum1 == true && whatNum2 == true) {			//1.정수가 모두 두 자리 수일떄
			if (plusOper == '+') {							//2.연산자도 +라면
				iResult = number1 + number2;				//result 변수에 두 정수 합을 저장하고 밑줄 출력
				System.out.print(number1 + inputOper + number2 + "=" + iResult);
			}	else {										//그게 아니라면 문구 출력
				System.out.print("+연산자가 아닌 다른 연산자입니다.");
			}
		}	else {											//1번 불만족이면 밑줄 출력
				System.out.print("입력한 숫자가 틀렸습니다.");
			}
		
		plusScanner.close();								//스캐너 닫기
		
	}
}

****0321 메뉴 주문받기****
import java.util.Scanner;

public class Practice {
	public static void main(String args[]) {
	
	Scanner cafeOrder;
	String myOrder;
	int total=0, iPrice=0;

	cafeOrder = new Scanner(System.in);
	
		while (true) {										//반복문 시작
			System.out.println("주문할 메뉴를 입력하세요.");
			myOrder=cafeOrder.next();
			
			switch(myOrder) {
			case "에스프레소":
				total = total + 1500;
				System.out.println("1500원 에스프레소를 주문받음");
				break;
			case "아메리카노":
				total = total + 2000;
				System.out.println("2000원 아메리카노를 주문받음");
				break;
			case "카페라떼":
				total = total + 2500;
				System.out.println("2500원 카페라떼를 주문받음");
			case "0":
				System.out.println("오늘 영업이 종료되었습니다. 오늘의 매출액은 "+ total +"원 입니다.");
				break;
			default:
				System.out.println("해당 메뉴가 존재하지 않습니다.");
			}
		}
				
	}													//반복문 끝
		
		//cafeOrder.close();   반복문에서 break를 거치면 이 문장으로 오는데 이걸로 스캐너 닫혀서 14줄에서 오류뜸
}

