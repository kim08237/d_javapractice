import java.util.Scanner;

public class Test_Class {
	//sda8*(~% @*$sOUZwers548096 skuioDSFS@#$ #^&^SvbJLWAN 3459sdIUdafsdf
	
	public static String inputString() {		//문자열 입력받아 반환하는 함수
		String scanStr;
		Scanner oScanner;		
		oScanner = new Scanner(System.in);	//스캐너 생성
		
		System.out.print("문자열을 입력하세요: ");
		
		while (true) {
		scanStr = oScanner.nextLine();
			if (scanStr.length()<10) {
				System.out.print("문자열의 길이가 50 미만입니다. 다시 입력하세요: ");
			}
			else 
				break;
		}
		
		oScanner.close();
		return scanStr;				//반환
	}


	public static void TypeandFreq() {
		
		String capCount[], smaCount[], numCount[];
		int speCount = 0;
		int i, m, n, o;
		
		capCount = new String[26];	//갯수 표시하는 배열 생성
		smaCount = new String[26];
		numCount = new String[10];
		
		for (i = 0; i<inputString().length(); i++) {
			
			if (65<=(int)(inputString().charAt(i)) && (int)(inputString().charAt(i))<=90) {
				capCount[(int)(inputString().charAt(i))-65] += 1;
			}
			else if (97<=(int)(inputString().charAt(i)) && (int)(inputString().charAt(i))<=122) {
				smaCount[(int)(inputString().charAt(i))-97] += 1;
			}
			else if (48<=(int)(inputString().charAt(i)) && (int)(inputString().charAt(i))<=57) {
				numCount[(int)(inputString().charAt(i))-48] += 1;
			}
			else {
				speCount += 1;
			}
			
		}
		
		for (m = 0; m < 26; m++) {
			System.out.print((65+m) + ": " + capCount[m] + " ");
		}
		System.out.print("\n");
		for (n = 0; n < 26; n++) {
			System.out.print((97+n) + ": " + smaCount[n] + " ");
		}
		System.out.print("\n");
		for (o = 0; o < 10; o++) {
			System.out.print((48+o) + ": " + numCount[o] + " ");
		}
		System.out.print("특수문자: " + speCount);
		
	}

}	//전체 클래스 닫는 괄호
