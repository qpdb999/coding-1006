/*
# Java 생성자 오버로딩과 상속 활용

========================================

오늘 배운 내용

오늘은 Java에서 생성자와 생성자 오버로딩을 활용해
객체를 생성하는 방법을 공부했다.

상속을 이용해 부모 클래스의 생성자를 호출하고,
배열과 for문을 활용해 여러 객체의 정보를 출력하는
방법도 함께 복습했다.


========================================

생성자 활용

생성자는 객체가 생성될 때 자동으로 실행되며
객체의 필드를 초기화하거나 특정 작업을
실행하는 데 활용할 수 있다.

예시:

Car() {
    System.out.println("차량이 생성되었습니다.");
}

Car 객체가 생성될 때 생성자가 실행되어
"차량이 생성되었습니다."가 출력된다.


========================================

생성자 오버로딩

하나의 클래스에서 매개변수의 개수나 자료형이
다른 생성자를 여러 개 만들 수 있다.

이를 생성자 오버로딩이라고 한다.

예시:

Car() {
    System.out.println("차량이 생성되었습니다.");
}

Car(String carNumber, double fuel) {
    this.carNumber = carNumber;
    this.fuel = fuel;
    System.out.println("차량이 생성되었습니다.");
}

매개변수가 없는 생성자와
차량번호와 연료량을 전달받는 생성자를
함께 사용할 수 있다.


========================================

this. 활용

this.는 현재 생성되는 객체의 필드를
가리킬 때 활용한다.

예시:

Car(String carNumber, double fuel) {
    this.carNumber = carNumber;
    this.fuel = fuel;
}

여기서 this.carNumber는 현재 객체의 필드이고
오른쪽 carNumber는 생성자의 매개변수이다.

this.를 사용하면 필드와 매개변수의 이름이
같아도 명확하게 구분할 수 있다.


========================================

상속과 extends 활용

SportsCar 클래스가 Car 클래스를 상속받도록
extends를 사용할 수 있다.

예시:

class SportsCar extends Car {
    
}

이렇게 하면 SportsCar는 Car의
필드와 메서드를 사용할 수 있다.

따라서 SportsCar에서 따로 showInfo()를
만들지 않아도 Car의 showInfo()를 사용할 수 있다.


========================================

super() 활용

자식 클래스의 생성자에서 super()를 사용하면
부모 클래스의 생성자를 호출할 수 있다.

예시:

SportsCar(String carNumber, double fuel) {
    super(carNumber, fuel);
}

여기서 super(carNumber, fuel)은
부모 클래스인 Car의

Car(String carNumber, double fuel)

생성자를 호출한다.

따라서 SportsCar 객체를 생성하면
Car의 생성자가 실행된다.


========================================

배열을 이용한 여러 객체 생성

같은 클래스의 객체를 배열에 저장하면
여러 객체를 하나의 배열로 관리할수 있다.

예시:

SportsCar[] cars = {
    new SportsCar("12가3456", 30.5),
    new SportsCar("34나5678", 50.2),
    new SportsCar("56다7890", 70.8)
};

한 번에 3개의 SportsCar 객체를 생성하고
cars 배열에 저장할 수 있다.


========================================

for문과 length 활용

배열에 저장된 객체를 하나씩 사용하기 위해
for문과 length를 활용할 수 있다.

예시:

for (int i = 0; i < cars.length; i++) {
    cars[i].showInfo();
}

cars.length는 배열의 길이를 나타낸다.

따라서 배열의 크기가 변경되어도
length를 이용하면 배열의 모든 객체를
반복해서 사용할수 있다.


========================================

전체 코드 활용

class Car {
    String carNumber;
    double fuel;

    Car() {
        System.out.println("차량이 생성되었습니다.");
    }

    Car(String carNumber, double fuel) {
        this.carNumber = carNumber;
        this.fuel = fuel;
        System.out.println("차량이 생성되었습니다.");
    }

    void showInfo() {
        System.out.println("차량번호: " + carNumber);
        System.out.println("연료량: " + fuel);
    }
}

class SportsCar extends Car {

    SportsCar(String carNumber, double fuel) {
        super(carNumber, fuel);
    }
}

public class Main {
    public static void main(String[] args) {

        SportsCar[] cars = {
            new SportsCar("12가3456", 30.5),
            new SportsCar("34나5678", 50.2),
            new SportsCar("56다7890", 70.8)
        };

        for (int i = 0; i < cars.length; i++) {
            cars[i].showInfo();
        }
    }
}


========================================

실행 결과

차량이 생성되었습니다.
차량이 생성되었습니다.
차량이 생성되었습니다.
차량번호: 12가3456
연료량: 30.5
차량번호: 34나5678
연료량: 50.2
차량번호: 56다7890
연료량: 70.8


========================================

복습하면서 알게 된 점

생성자 오버로딩을 이용하면 같은 클래스에서
서로 다른 방식으로 객체를 생성할 수 있다는 것을 알게 되었다.

상속을 이용하면 부모 클래스의 기능을
자식 클래스에서 재사용할 수 있고,
super()를 사용하면 부모 클래스의 생성자를
호출할 수 있다는 것을 확인했다.

배열과 for문을 함께 사용하면 여러 객체를
효율적으로 관리하고 출력할 수 있다는 것도
알게 되었다.


========================================

AI 활용 복습 문제

1. 생성자의 이름은 무엇과 같아야 하는가?

1. 메서드 이름
2. 변수 이름
3. 클래스 이름
4. 객체 이름

정답: 3


2. 생성자 오버로딩이란?

1. 생성자를 삭제하는 것
2. 하나의 클래스에 여러 생성자를 만드는 것
3. 생성자를 상속받는 것
4. 생성자를 static으로 만드는 것

정답: 2


3. this.carNumber가 의미하는 것은?

1. 매개변수 carNumber
2. 현재 객체의 carNumber 필드
3. 부모 클래스의 carNumber
4. 새로운 객체

정답: 2


4. extends의 역할은?

1. 반복문 실행
2. 클래스 상속
3. 객체 삭제
4. 배열 생성

정답: 2


5. super(carNumber, fuel)의 역할은?

1. 자식 클래스의 메서드 호출
2. 부모 클래스의 생성자 호출
3. 새로운 배열 생성
4. 현재 객체의 필드 변경

정답: 2


6. cars.length가 의미하는 것은?

1. 배열에 저장된 객체의 개수
2. 배열의 마지막 인덱스
3. 객체의 이름
4. 생성자의 개수

정답: 1


7. 다음 코드에서 호출되는 생성자는?

SportsCar("12가3456", 30.5)

1. Car()
2. Car(String, double)
3. SportsCar()
4. Main()

정답: 2


8. 다음 for문의 목적은?

for (int i = 0; i < cars.length; i++) {
    cars[i].showInfo();
}

1. 자동차 객체를 생성한다.
2. 배열의 모든 자동차 정보를 출력한다.
3. 자동차를 삭제한다.
4. 생성자를 오버로딩한다.

정답: 2
*/