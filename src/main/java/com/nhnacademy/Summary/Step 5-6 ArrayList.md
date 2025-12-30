# Step 5-6 ArrayList

##  ArrayList 사용하기
### ArrayList란?

- ArrayList는 내부적으로 배열을 사용하지만, 크기 관리를 자동으로 해주는 클래스입니다. 배열의 장점(빠른 인덱스 접근)을 유지하면서, 크기 고정 문제를 해결합니다.

ArrayList 내부 동작:
┌───────────┬───────────┬───────────┬ ─ ─ ─ ─ ┐
│  "Java"   │  "운동"    │  "독서"    │ (여유공간) │  ← 내부 배열
└───────────┴───────────┴───────────┴ ─ ─ ─ ─ ┘
    [0]         [1]         [2]

add("영화") 호출 시:
┌───────────┬───────────┬───────────┬───────────┬ ─ ─ ┐
│  "Java"   │  "운동"    │  "독서"    │  "영화"    │      │  ✅ 자동 추가
└───────────┴───────────┴───────────┴───────────┴ ─ ─ ┘
    [0]         [1]         [2]         [3]

용량 부족 시 → 더 큰 배열 생성 & 복사 (자동 처리)

## 코드로 비교

### 배열의 한계:

String[] todoArray = new String[3];  // 크기 3으로 고정
todoArray[0] = "Java 공부";
todoArray[1] = "운동하기";
todoArray[2] = "독서";
todoArray[3] = "영화 보기";  // ❌ ArrayIndexOutOfBoundsException!
ArrayList의 해결:

ArrayList<String> todoList = new ArrayList<>();  // 크기 제한 없음
todoList.add("Java 공부");
todoList.add("운동하기");
todoList.add("독서");
todoList.add("영화 보기");  // ✅ 정상 동작!
todoList.add("여행 계획");  // ✅ 계속 추가 가능!

### 선언 및 생성:

import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();  // 문자열 저장
ArrayList<Integer> numbers = new ArrayList<>();  // 정수 저장
ArrayList<Todo> todoList = new ArrayList<>();  // Todo 오브젝트 저장
+ <> 안에 저장할 타입을 지정합니다. 기본형(int, boolean 등)은 사용할 수 없고, 래퍼 클래스(Integer, Boolean 등)를 사용합니다.

### 주요 메서드:

메서드  	        설명        	예시
add(element)	요소 추가	    list.add(todo)
get(index)	    인덱스로 조회	 list.get(0)
size()	        요소 개수	    list.size()
isEmpty()	    비어있는지 확인	  list.isEmpty()
remove(index)	인덱스로 삭제	 list.remove(0)

### 사용 예시:

ArrayList<Todo> todoList = new ArrayList<>();

// 추가
todoList.add(new Todo("공부", 3, false));
todoList.add(new Todo("운동", 1, false));

// 크기 확인
System.out.println("TODO 개수: " + todoList.size());  // 2

// 비어있는지 확인
if (todoList.isEmpty()) {
    System.out.println("등록된 TODO가 없습니다.");
}

### 배열 vs ArrayList:

특성	배열 (Array)	                      ArrayList
크기	고정 (생성 시 결정)	                 가변 (자동 확장)
선언	String[] arr = new String[3];	 ArrayList<String> list = new ArrayList<>();
추가	arr[0] = "값";	                  list.add("값");
조회	arr[0]	                         list.get(0)
길이	arr.length	                     list.size()