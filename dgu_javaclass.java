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

public class Cls_ScannerTest {

	public static void main(String args[]) {
	
		System.out.println("이름, 나이, 체중, 독신 여부를 입력하세요.");
		
		Scanner myScanner;				//스캐너 지정
		String mName;
		int mAge;
		double mWeight;
		boolean mSingle;
		
		
		myScanner = new Scanner(System.in);		//스캐너 이름 지정
		System.out.print("이름을 입력하세요: ");	 
		mName = myScanner.next();			// . 앞에 스캐너 이름 써줘야 해
		
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

****0314 홀짝 ****
import java.util.Scanner;

public class Cls_OddEven {

	public static void main(String args[]) {
		
	System.out.print("정수를 입력하세요.: ");
	
	Scanner oddScanner;
	int number;
	
	oddScanner = new Scanner(System.in);
	number = oddScanner.nextInt();
	
	if (number%2 == 0) {
		System.out.print(number + "는(은) 짝수입니다.");
	}
	else {
		System.out.print("홀수입니다.");
	}
	
	oddScanner.close();
	}
}
