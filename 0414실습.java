/*1번*/
class TV{
	String name;
	int year, size;
	
	TV(String name, int year, int size){
		this.name = name;
		this.year = year;
		this.size = size;
	}
	void show(){
		System.out.println(name +"에서 만든 " + year +"년형 "+size+"인치 TV");
	}
}

public class Practice1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}


/*2번*/
import java.util.Scanner;

class Grade{
	int math, science, english;
	
	Grade(int m, int s, int e) {
	this.math = m;
	this.science = s;
	this.english = e;
	}
	
	double average() {
		return (math+science+english)/3.0;
	}
}

public class Practice1 {

	public static void main(String[] args) {
		Scanner oScanner;
		
		oScanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = oScanner.nextInt();
		int science = oScanner.nextInt();
		int english = oScanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+ me.average());
		
		oScanner.close();
	}

}

/*3번*/
