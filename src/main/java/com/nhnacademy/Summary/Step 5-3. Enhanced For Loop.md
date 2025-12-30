# Step 5-3 Enhanced For Loop

## 반복문: for-each문 (향상된 for문)
### for-each문이란?
- 배열이나 컬렉션의 모든 요소를 순서대로 접근하는 반복문
- 인덱스 없이 요소에 직접 접근
- Java 5부터 도입 (Enhanced for loop)

### 기본 문법:

for (요소타입 변수명 : 배열/컬렉션) {
    // 변수를 사용하는 코드
}

### 배열 순회:

int[] scores = {90, 85, 78, 92};

// for-each로 모든 요소 접근
for (int score : scores) {
    System.out.println(score);
}
// 출력: 90, 85, 78, 92

### 기본 for문 vs for-each 비교:

String[] fruits = {"사과", "바나나", "오렌지"};

// 기본 for문 - 더 복잡
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}

// for-each - 더 간결 (권장)
for (String fruit : fruits) {
    System.out.println(fruit);
}

### 합계/평균 계산:

int[] numbers = {10, 20, 30, 40, 50};

int sum = 0;
for (int num : numbers) {
    sum += num;
}
System.out.println("합계: " + sum);        // 150
System.out.println("평균: " + sum / numbers.length);  // 30

### ArrayList 순회:

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");

for (String name : names) {
    System.out.println("이름: " + name);
}

### 오브젝트 순회:

ArrayList<Todo> todoList = new ArrayList<>();
todoList.add(new Todo("공부", 3, false));
todoList.add(new Todo("운동", 1, true));

for (Todo todo : todoList) {
    String status = todo.isDone() ? "[완료]" : "[미완료]";
    System.out.println(status + " " + todo.getTitle());
}
// 출력:
// [미완료] 공부
// [완료] 운동

### for-each의 한계:

ArrayList<String> items = new ArrayList<>();
items.add("A");
items.add("B");
items.add("C");

// ❌ 인덱스를 알 수 없음
for (String item : items) {
    // 현재 몇 번째인지 알 수 없음
    System.out.println(item);
}

// ❌ 역순 순회 불가
// for-each는 항상 처음부터 끝까지 순서대로만 가능

// ❌ 순회 중 삭제 불가
for (String item : items) {
    if (item.equals("B")) {
        items.remove(item);  // ConcurrentModificationException!
    }
}

### 언제 어떤 것을 사용할까?:

    상황	              권장 방식
모든 요소를 순서대로 접근	 for-each (간결)
인덱스(번호)가 필요	       기본 for문
역순으로 순회          	  기본 for문
특정 위치부터 순회	       기본 for문
순회 중 요소 삭제	      기본 for문 또는 Iterator