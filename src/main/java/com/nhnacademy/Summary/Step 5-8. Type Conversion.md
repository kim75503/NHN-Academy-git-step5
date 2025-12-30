# Step 5-8. Type Conversion

## 타입 변환 (입력 처리)

### 문자열 → 숫자 변환:

String input = "42";
int number = Integer.parseInt(input);      // 문자열 → int
long bigNum = Long.parseLong(input);       // 문자열 → long
double decimal = Double.parseDouble("3.14"); // 문자열 → double

### 문자열 → boolean 변환:

Boolean.parseBoolean("true");   // true
Boolean.parseBoolean("TRUE");   // true (대소문자 무관)
Boolean.parseBoolean("false");  // false
Boolean.parseBoolean("yes");    // false ("true" 외에는 모두 false)

### BufferedReader와 함께 사용:

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

System.out.print("시간 입력: ");
String input = reader.readLine();
int hours = Integer.parseInt(input);  // 문자열 → int 변환

System.out.println("입력한 시간: " + hours);