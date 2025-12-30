# Step 5-7. Iterating List

## 리스트 순회 (반복) 방법

1. for-each 문 (권장):

// 모든 요소를 순서대로 접근
for (Todo todo : todoList) {
    System.out.println(todo.getTitle());
}

2. index 기반 for 문:

// 인덱스가 필요할 때 사용
for (int i = 0; i < todoList.size(); i++) {
    Todo todo = todoList.get(i);
    System.out.println((i + 1) + ". " + todo.getTitle());
}
### 목록 출력 예시:

public void printAll() {
    if (todoList.isEmpty()) {
        System.out.println("등록된 TODO가 없습니다.");
        return;
    }

    System.out.println("=== TODO 목록 ===");
    for (int i = 0; i < todoList.size(); i++) {
        Todo todo = todoList.get(i);
        String status = todo.isDone() ? "[완료]" : "[미완료]";
        System.out.printf("%d. %s %s (%d시간)%n",
            i + 1,
            status,
            todo.getTitle(),
            todo.getHours());
    }
}