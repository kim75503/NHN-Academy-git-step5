# Step 5-4. Break and Continue

## 반복문: break와 continue
### break - 반복문 즉시 종료:

// 특정 값을 찾으면 반복 중단
int[] numbers = {10, 20, 30, 40, 50};

for (int num : numbers) {
    if (num == 30) {
        System.out.println("30을 찾았습니다!");
        break;  // 반복문 즉시 종료
    }
    System.out.println("검사 중: " + num);
}
// 출력:
// 검사 중: 10
// 검사 중: 20
// 30을 찾았습니다!

### continue - 현재 반복만 건너뛰기:

// 짝수만 출력 (홀수는 건너뛰기)
for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
        continue;  // 홀수면 아래 코드 건너뛰고 다음 반복으로
    }
    System.out.println(i);
}
// 출력: 2, 4, 6, 8, 10

// 완료된 TODO만 건너뛰기
for (Todo todo : todoList) {
    if (todo.isDone()) {
        continue;  // 완료된 항목은 건너뛰기
    }
    System.out.println(todo.getTitle());  // 미완료 항목만 출력
}

### break vs continue:

키워드	        동작
break	    반복문 완전히 종료
continue	현재 반복만 건너뛰고 다음 반복 계속

### 실용 예제 - ArrayList에서 검색:

ArrayList<Todo> todoList = new ArrayList<>();
// ... TODO 추가

// 특정 제목의 TODO 찾기
Todo found = null;
for (Todo todo : todoList) {
    if (todo.getTitle().equals("Java 공부")) {
        found = todo;
        break;  // 찾았으면 더 이상 검색하지 않음
    }
}

if (found != null) {
    System.out.println("찾음: " + found.getTitle());
} else {
    System.out.println("해당 TODO가 없습니다.");
}