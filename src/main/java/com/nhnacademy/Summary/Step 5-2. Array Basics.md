# Step 5-2. Array Basic

## 배열(Array) 사용하기
### 배열이란?

- 같은 타입의 데이터를 연속된 공간에 저장하는 자료구조
- 배열의 크기는 생성 시 고정되며, 이후 변경 불가

### 배열 선언 및 생성:

// 방법 1: 크기만 지정 (기본값으로 초기화)
int[] numbers = new int[5];        // [0, 0, 0, 0, 0]
String[] names = new String[3];    // [null, null, null]

// 방법 2: 값과 함께 초기화
int[] scores = {90, 85, 78, 92};
String[] fruits = {"사과", "바나나", "오렌지"};

### 배열 접근:

int[] scores = {90, 85, 78};

// 인덱스로 접근 (0부터 시작)
System.out.println(scores[0]);  // 90 (첫 번째)
System.out.println(scores[2]);  // 78 (세 번째)

// 값 변경
scores[1] = 95;  // 85 → 95

// 길이 확인
System.out.println(scores.length);  // 3

### 배열 순회 (기본 for문):

String[] fruits = {"사과", "바나나", "오렌지"};

// index 기반 for 문
for (int i = 0; i < fruits.length; i++) {
    System.out.println((i + 1) + ". " + fruits[i]);
}

### 배열의 한계:

int[] numbers = new int[3];  // 크기 3으로 고정
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;  // ❌ ArrayIndexOutOfBoundsException!

    특징	        설명
고정 크기	    생성 후 크기 변경 불가
인덱스 접근	       0부터 시작
같은 타입만	    한 배열에 한 가지 타입만 저장
빠른 접근	    인덱스로 O(1) 접근

+ 배열은 크기가 고정되어 있어 동적으로 데이터를 추가/삭제하기 어렵습니다. 이 문제를 해결하기 위해 ArrayList를 사용합니다.