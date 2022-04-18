/*main*/

public class Main {
	public static void main(String [] args) {
		Point oPoint;
		ColorPoint cp;
		
		oPoint = new Point();
		cp = new ColorPoint();
		
		oPoint.set(1, 2); 			//Point크래스의 set()호출
		oPoint.showPoint();
		oPoint.getX();
		//oPoint.x = 5;			//객체는 private에 접근할 수 없어
		
		
		cp.set(3, 4);				//Point의 set()호출
		cp.setColor("red"); 	//colorpoint의 setcolor()호출
		cp.showColorPoint();	//컬러와 좌표 추력
		cp.showColorPointX();
	}
}

/*Point*/
public class Point {
	private int x, y;
	
	public Point() {		//생성자는 리턴형 가지지않아!!!
		x = 0;
		y = 0;
	}
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		System.out.println("x좌표: " +x);
		return x;
	}
	
	public void showPoint() {
		System.out.println("(" +x +"," +y +")");
	}
}
/*ColorPoint*/

public class ColorPoint extends Point {
	private String sColor;
	
	public ColorPoint() {	//생성자임
		sColor = "";	
		//윗줄 안써도댐. 근데 생성자는 멤버 필드 초기화하려고 쓰는거니깐 연습차원에서 쓰자
	}
	
	public void setColor(String sColor) {
		this.sColor = sColor;
	}
	public void showColorPoint() {
		//System.out.println(sColor +"(" +x +"," +y +")");
		//윗줄 왜 오류일까? Point의 x,y가 private이기때문에!
		
		System.out.print(sColor);
		showPoint();		//return값이 void니까 윗줄에 같이못써
	}
	public void showColorPointX() {
		System.out.print(sColor+"(" +getX() +")");
	}
}
