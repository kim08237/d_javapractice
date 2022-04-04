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
배열: 같은 type의 여러개 data를 하나의 이름으로 저장하는 것. 구별은 인덱스로 한다. new 선언해야 인덱스 사용 가능
초기화 : 선언과 동시에 값을 부여하는 것. ex) int i=0;, int intArr[]={0,1,2};
변수: 지역변수, 전역변수, 멤버변수, 매개변수
생성자: 클래스 이름과 도일한 특별한 메소드, 객체가 생성될 떄 자동으로 한 번 생성되는 메소드, 개발자는 객체를 초기화하는 데 필요한 코드 작성













------------------------32줄 시작----------------------------
차례
(70)  0307
(90)  0310 원의 넓이 구하기
(110) 0314 Scanner
(150) 0314 홀짝
(180) 0314 3의배수/10~20 출력
(210) 0317 scan으로 정수 합 구하기
(260) 0321 메뉴 주문받기
(310) 0324 구구단 짜기
(340) 0324 배열 입력받기
(370) 0328 배열 입력하고 최댓값, 최솟값 찾기
(420) 0328 로또번호 6개 입력하기
(510) 0331 이차원 배열 랜덤 수 입렬하기
(560) 0404 try catch
(590) 0404 함수 만들어서 정수 더하기
(620) 0404 클래스함수 만들기





















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










****0324 구구단 짜기****
package practice;
import java.util.Scanner;

public class Plus1to10 {
	public static void main(String[] args) {
		
		Scanner scanDan;
		int danNum, mulNum, numPlus1;
		
		scanDan = new Scanner(System.in);
		
		while (true) {
			danNum = scanDan.nextInt();
		
			if (danNum !=0) {
				for (mulNum=0; mulNum<9; mulNum++) {
					numPlus1 = mulNum + 1;
					System.out.print(danNum+ "*" + numPlus1 +"="+ danNum*numPlus1 +" ");
				}
				System.out.print("\n======================="+danNum+"단==========================\n");
			}
			else {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		} //와일문 끝
	}
}

****0324 배열 입력받기****
package practice;
import java.util.Scanner;
public class Plus1to10 {
	public static void main(String[] args) {
		
		final int ARR_SIZE =3;					//int에서 안바뀜. final선언하면 다 대문자로 써야해
		Scanner inputNum;
		int intArray[], index;
		
		intArray= new int[ARR_SIZE];					//intArray[0]~intArrat[9]
		inputNum = new Scanner(System.in);				//스캐너
		
		
		for (index = 0; index < ARR_SIZE; ++index) {	//입력받은 정수를 배열에 저장
			System.out.print("정수를 입력하세요: ");
			intArray[index]= inputNum.nextInt();
		}
		
		for (index = 0; index < ARR_SIZE; ++index) {	//배열 출력
			System.out.println("입력된 값: " + intArray[index]);
		}
		inputNum.close();
	}
}





****0328 배열 입력하고 최댓값, 최솟값 찾기****
import java.util.Scanner;

public class Arrayint {

	public static void main(String[] args) {

		int i, max, min, wMax, wMin;
		Scanner nScanner;
		int iArray[];
		nScanner = new Scanner(System.in);		//선언하기
		
		iArray = new int[5];					//배열 생성하기
		
		System.out.print("정수를 입력하세요");
		
		for (i=0; i<iArray.length;i++) {		//배열 입력받기
			iArray[i] = nScanner.nextInt();
		}
		
		max = iArray[0];
		min = iArray[0];
		wMax = 0;
		wMin = 0;								//알고자 하는 변수 초기화
		
		for (i=0; i<iArray.length;i++) {		//최댓값과 위치 구하기
		 	if (iArray[i] > max) {
				max = iArray[i];
				wMax = i;
		 	}
			if (iArray[i] < min) {				//최솟값과 위치 구하기
				min = iArray[i];
				wMin = i;
			}		
		}
		
		
		System.out.println("입력값 중 최댓값은 "+(wMax+1)+"번째 숫자 " +max+"입니다");
		System.out.println("입력값 중 최댓값은 "+(wMin+1)+"번째 숫자 " +min+"입니다");
		
		nScanner.close();

	}
}






****0328 로또번호 6개 입력하기****
import java.util.Scanner;
//import java.util.Random;

public class Pactice {

	public static void main(String[] args) {

		int i, mulNum, lottoNum, count;			//mulNum: 중복 확인 변수, lottoNum: 입력한 정수, count: 배열에 저장된 숫자 갯수
		Scanner nScanner;
		//Random nRandom;
		int iArray[];
		
		nScanner = new Scanner(System.in);		//변수들 선언
		//nRandom = new Random();
		
		iArray = new int[6];					//배열 생성
		count = 0;
		
		System.out.print("정수를 입력하세요..: ");
		
		for (i = 0; i < iArray.length; i++) {
			lottoNum = nScanner.nextInt();							//수를 입력받고
			//lottoNum = nRandom.nextInt(45)+1;
			
			if (lottoNum >= 1 && lottoNum <= 45) {					//이게 범위 사이일때
				if (i == 0) {										//입력을 처음 받는다면 배열에 그냥 저장
					iArray[0] = lottoNum;
					count = 1;
				} 	else {												//입력이 처음이 아니면 중복확인 절차를 거쳐야 한다
						for (mulNum = 0; mulNum < count; mulNum++) {
							if (iArray[mulNum] == lottoNum) {			//입력한 수와 겹치는게 있다면
								System.out.print("중복된 숫자를 입력하였습니다. 다시 입력하세요: ");
								i = count - 1;
								break;									//중복확인 for문 벗어나 다시 입력받기
							}
							
							if (mulNum == count - 1) {					//마지막까지 비교가 다 끝났으면 배열에 저장
								iArray[i] = lottoNum;
								count++;
								break;									//이거!!이거!!!이거뺴먹었었다구!!
							}											//중복 입력 안해도 중복문구 뜨는게 여기 break 없어서 떴던거였어
						}
				}
			}	else {													//근데 범위 사이가 아니면 아래 출력하고 재입력
					System.out.print("1과 45 사이의 숫자를 입력하여야 합니다. 다시 입력하세요: ");
					i = count -1;
			}
			
		}
		
////////////////////////////////////////////////////////////////////////////
		/* 이런식 코드도 알아두자
		bFLag = true;
		while(true) {
			lottoNum = nScanner.nextInt();	
			if (lottoNum >1  && lottoNum <= 45) {
				for ( mulNum = 0; mulNum<count; mulNum++){
					if (iArray[mulNum] == lottoNum) {
						System.out.println("중복 오류");
						bFlag = false;
						break;				
			} else {
			iArray[mulNum] = lottoNum;
			count = count +1
			}
		}
		if (bFlag == true) {
		break;
		}
		*/
////////////////////////////////////////////////////////////////////////////
		
		for (i=0; i<iArray.length;i++) {			//입력받은 6개 숫자 출력하기
			System.out.print(iArray[i]+" ");
			}
		
		nScanner.close();
	}
}










****0331 이차원 배열 랜덤 수 입렬하기****
import java.util.Random;

public class Practice {

	public static void main(String[] args) {

		int i, m, n, ranArr[], resultArr[][];		//i는 2차원배열에 값 넣는 for문에, m/n은 resultArr출력하는 for문에
		Random oRan, colRan, rawRan;		//랜덤값 만들어내는 함수 정의
		int colRanNum, rawRanNum;			//colRanNum은 colRan에서 랜덤으로 출력한 정수(행을 결정함), ranRanNum은 열 결정
		
		oRan = new Random();				//랜덤값 만들어내는 함수 생성
		colRan = new Random();
		rawRan = new Random();
		
		ranArr = new int[10];				//랜덤으로 생성한 10개의 숫자 저장하는 배열
		resultArr = new int[4][4];			//ranArr배열을 2차원 배열에 저장한 것

		System.out.print("랜덤 생성된 10개의 숫자: ");
		for (i = 0; i<10; i++) {									//랜덤값 10개를 ranArr에 저장
			ranArr[i] = oRan.nextInt(9)+1;
			System.out.print(+ranArr[i] + " ");
		}
		
		System.out.println("\n//////////////////////////////////////");
		
		for (i = 0; i < 10; i++) {
			colRanNum = colRan.nextInt(4);
			rawRanNum = rawRan.nextInt(4);
			
			if (resultArr[colRanNum][rawRanNum] == 0) {				//2차원 배열에 아직 입력되지 않았다면 배열에 집어넣고
				resultArr[colRanNum][rawRanNum] = ranArr[i];
			} else {												//아니면 다시 랜덤값 받아야지
				i = i - 1;
			}
		}
		
		for (m = 0; m < 4; m++) {									//결과 배열 출력하기
			for (n = 0; n < 4; n++) {
				System.out.print(resultArr[m][n] + " ");
			}
			System.out.print("\n");
		}
		
	}
}




****0404 try catch****
import java.util.Scanner;
import java.util.InputMismatchException;

public class Practice {

	public static void main(String[] args) {

		Scanner oScanner;
		int iInval;
		
		oScanner = new Scanner(System.in);
			try {
				System.out.print("정수 입력: ");
				iInval = oScanner.nextInt();
				System.out.println("입력된 정수: :" + iInval / 0);
			} catch(InputMismatchException a) {
				System.out.println("잘못된 입력..");
			} catch(ArithmeticException e) {
				System.out.println("잘못된 처리..");
			}
		
		oScanner.close();
	}
}





****0404 함수 만들어서 정수 더하기****
import java.util.Scanner;

public class Practice {

	public static int add(int a, int b) {
		int result;
		result = a+b;
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner iScanner;
		int num1, num2, fResult=0 ;
		
		iScanner = new Scanner(System.in);
		
		System.out.print("2개의 정수를 입력하세요. " );
		num1 = iScanner.nextInt();
		num2 = iScanner.nextInt();
	
		fResult = add(num1, num2); //함수 호출. y=f(x) 생각해!!
		
		System.out.println("두 정수의 합은 "+ fResult);
	
		iScanner.close();
	}
}

****0404 클래스 함수 만들기****
/* MyTest 클래스 */
public class MyTest {
	public int iRadius;			//iRadius는 이 클래스의 멤버변수
	public String sName;
	
	public MyTest() {			//멤버변수의 초기값 주는데 쓰고 안줄거면 {}안 비워두기
		iRadius = 1;
		sName = "My Circle";
	}
	public MyTest(int iNo) {	//이 경우는 overloading
		iRadius = iNo;			//practice클래스에서 MyTest(5)하면 반지름을 5로 계산
		sName = "My Circle";
	}
	public double getArea() {
		double dArea; 			//dArea는 지역변수
		dArea = 3.14*iRadius*iRadius;
		return dArea;
	}
	
	public double getRound() {
		double dRound; 			//dArea는 지역변수
		dRound = 2*3.14*iRadius;
		return dRound;
	}
}

/* Practice 클래스 */
public class Practice {
	
	public static void main(String[] args) {
		MyTest oPizza;
		
		oPizza = new MyTest();
		oPizza.iRadius = 10;
		
		System.out.println("반지름은 " + oPizza.iRadius);
		System.out.println("넓이는 " + oPizza.getArea());
		System.out.println("둘레는 " + oPizza.getRound());
	}
}
