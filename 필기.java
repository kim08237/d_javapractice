자바는 독립적, 자바 가상 기계는 종속적(JVM, Java virtual machine)

###프로젝트 이름 중요해### 프로젝트 이름 띄어쓰기 못하니 대문자쓰거나 언더바(_)써
클래스 이름 정할 때 중요한 것: 첫글자 대문자. 클래스가 아닌 것은 소문자로 시작
클래스이름, 프로젝트이름 등 한글 사용 가능하나 전세계 개발자들이 그렇게 안하니 걍 대문자로 시작해

//는 주석을 뜻해

"______"는 문자열(string), ' '는 문자 하나(char)    문자열인데 작은따옴표 ' '쓰면 오류떠. invalid character constnat

하나의 소스 파일에 여러 클래스 작성 가능하나 여러개는 비추고 하나만 작성 추천.컴파일된 클래스 파일에는 클래스는 하나만 존재.
클래스는 첫문자 대문자로시작. 변수/메소드는 시작은 소문자 첫단어 이후 각 단어의 첫먼쨰문자 대문자로

셤문제)) 생성자의 특징 세가지를 쓰시오
셤문제: 다형성이 뭐임?
셤문제: 자바에서 사용하는 접근지정자 네개랑 의미 쓰기
셤문제: static 이랑 non-static구분하는거
셤문제?: this랑 this() 차이점

break는 자신을 갑싸고 있는 '반복문' 하나만 빠져나온다

배열: 같은 type의 여러개 data를 하나의 이름으로 저장하는 것. 구별은 인덱스로 한다. new 선언해야 인덱스 사용 가능

초기화 : 선언과 동시에 값을 부여하는 것. ex) int i=0;, int intArr[]={0,1,2};

변수: 지역변수, 전역변수, 멤버변수, 매개변수
생성자: 클래스 이름과 동일한 특별한 메소드, 객체가 생성될 떄 자동으로 한 번 생성되는 메소드, 개발자는 객체를 초기화하는 데 필요한 코드 작성, 객체가 생성될 때 반드시 호출됨(그러므로 하나 이상 선언되어야 함)
함수의 이름은 같은데 매개변수의 갯수나 타입이 다를 때: 오버로딩. 리턴 타입은 오버로딩과 관련 없음

기본 생성자: 매개 변수가 없는 생성자. 디폴트 생성자로도 부름. 클래스에 생성자가 하나도 선언되지 않은 경우, 컴파일러에 의해 자동으로 삽입
기본생성자가 생성자를 자동으로 만드는 경우와 아닌경우: 매개변수를 하나라도 설정한 경우 자동생성하지 않아

this(): 클래스 내의 다른 생성자 호출, 반드시 클래스의 첫 줄에서만 사용(안그러면 컴파일 오류)

객체 배열: 생성자가 생성되지 않아

자바의 모든 메소드는 반드시 클래스 안에 있어야 함(캡슐화원칙)

접근지정자: 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용. 객체 지향언어의 캡슐화 정책은 멤버를 보호하는 것.
  -public: 패키지 관계없이 모든 클래스에 허용
  -protected: 같은 패키지 내 다른 모든 클래스에 접근허용, 상속받은 서브(자식) 클래스는 다름 패키지에 있어도 접근 가능
  -디폴트: 같은 패키지의 다른 클래스에 접근 허용 
  -private: 상속받은 서브클래스 접근 불가, 외부로부터 완벽차단

static 멤버: 클래스당 하나만 생성. this 사용불가
non-static멤버: new를 통해 선언&생성해야 함

final 필드, 상수 선언: 선언 시에 초기 값 지정. 실행 중에 값 변경할 수 없다.
  
부모클래스 = 슈퍼클래스, 자식클래스 = 서브클래스. 상속할때 extends 키워드 사용
상속받았으면 부모클래스에서 가진 필드는 새로 지정할필요 없어
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
조교님 메일 code@dgu.ac.kr
