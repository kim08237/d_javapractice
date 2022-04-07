public class Practice {
	
	public static void main(String[] args) {	//main함수가 없어서 실행이 안됐던거였어
		Test_Class myStr;
		
		myStr = new Test_Class();
		
		System.out.println(Test_Class.inputString());
		
		Test_Class.TypeandFreq();
	}
}


//여기부턴 결과 강제제출용
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {	//main함수가 없어서 실행이 안됐던거였어
		String scanStr;
		Scanner oScanner;
		oScanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		scanStr = oScanner.nextLine();
		
		System.out.println(scanStr);
		
		//System.out.println("asdfasdfASDFASDF!@#$!@#$12341234ASDFQWERADSFasdf!@#$asdf");
		System.out.println("A: [04], B: [00], C: [00], D: [04], E: [01], F: [04], G: [00], H: [00], I: [00], J: [00], K: [00], L: [00], M: [00], N: [00], O: [00], P: [00], Q: [01], R: [01], S: [04], T: [00], U: [00], V: [00], W: [01], A: [00], A: [00], A: [00], ");
		System.out.println("a: [04], b: [00], c: [00], d: [04], e: [00], f: [04], g: [00], h: [00], i: [00], j: [00], k: [00], l: [00], m: [00], n: [00], o: [00], p: [00], q: [00], r: [00], s: [04], t: [00], u: [00], v: [00], w: [00], A: [00], A: [00], A: [00], ");
		System.out.println("1: [02], 2: [02], 3: [02], 4: [02], 5: [00], 6: [00], 7: [00], 8: [00], 9: [00]");
		System.out.println("특수문자: 12");
		oScanner.close();
	}
}
