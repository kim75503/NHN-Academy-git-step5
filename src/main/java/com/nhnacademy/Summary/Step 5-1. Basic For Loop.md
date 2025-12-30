# Step 5-1. Basic For Loop

## 반복문: 기본 for 문
### for문이란?
- 지정한 횟수만큼 코드를 반복 실행하는 제어문
- 초기화, 조건, 증감을 한 줄에 작성

### 기본 문법:
for (초기화; 조건; 증감){
    //반복할 코드
}

### 실행 순서:
1. 초기화 (1회만 실행)
2. 조건 검사 -> false면 종료
3. 반복할 코드 실행
4. 증감 실행
5. 2번으로 돌아감

### 기본 예제:

```java
//1부터 5까지 출력
for( int i = 1; i <= 5; i++){
    System.out.println(i);
}
//출력: 1, 2, 3, 4, 5

//0부터 4까지 (5회 반복)
for ( int i = 0; i < 5; i++){
    System.out.println("반복 " + i);
}
```

### 다양한 형태:
```java
// 감소 (역순)
for (int i = 5; i >= 1; i--) {
    System.out.println(i);  // 5, 4, 3, 2, 1
}

// 2씩 증가
for (int i = 0; i < 10; i += 2) {
    System.out.println(i);  // 0, 2, 4, 6, 8
}

// 특정 범위
for (int i = 10; i < 15; i++) {
    System.out.println(i);  // 10, 11, 12, 13, 14
}
```
### 배열과 함께 사용:
```java
int[] scores = {90, 85, 78, 92};

// 배열의 모든 요소 출력
for (int i = 0; i < scores.length; i++) {
    System.out.println("점수 " + (i + 1) + ": " + scores[i]);
}

// 합계 계산
int sum = 0;
for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
}
System.out.println("합계: " + sum);  // 345
```
### ArrayList와 함께 사용:
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

// 번호와 함께 출력
for (int i = 0; i < names.size(); i++) {
    System.out.println((i + 1) + ". " + names.get(i));
}
// 출력:
// 1. Alice
// 2. Bob
// 3. Charlie
```
### for문 사용 시점:

| 상황 | 사용 권장 |
|------|------------|
| 인덱스(번호)가 필요할 때 | ✅ 기본 for문 |
| 특정 횟수만큼 반복할 때 | ✅ 기본 for문 |
| 역순으로 순회할 때 | ✅ 기본 for문 |
| 단순히 모든 요소 접근 | for-each 권장 |
