# CheatSheet - 구현

## 대소문자 변환하기

### Character.isLowerCase()
- 입력받은 인자가 소문자인지 확인 후 t/f를 리턴한다.
- System.out.println(Character.isLowerCase(char ch));

### Character.ToUpperCase()
- 입력받은 인자가 대문자인지 확인 후 t/f를 리턴한다.

### str.toCharArray()
- 문자열의 문자들을 문자배열로 추출한다.
- 문자열의 각 문자를 문자 배열에 복사한다.
- string(문자열)의 각 문자들을 char[] 에 복사한다.

### 아스키

- 대문자 : 65-90
- 소문자 : 97-122
- 숫자 : 0 -> 48, 9-> 57

### 정규표현식
- [^0-9] : 숫자가 아닌 문자열 찾기
- [^//d] : 숫자가 아닌 문자 찾기 (//d : 숫자 의미)
- [//D] : 문자만 찾기 (//D : 문자의미)

## 문자열 찾기
### str.charAt(0);
- string 인 str 에서 0번째 인덱스 문자를 char 형으로 변환한다.
### str.charAt(i) == t
- for 문과 함께 사용하는 예시로, str 의 문자들을 순회하면서 t가 있는지 검사한다.

## 단어 뒤집기 → re
### ArrayList<String> answer = new ArrayList<>();
- ArrayList : 크기가 동적으로 조절되는 자료구조
- <String> : ArrayList에 string 요소를 저장하도록 선언

### StringBuilder(x).reverse().toString();
- StringBuilder : 가변하는 버퍼를 사용하여 문자열을 처리한다. -> 문자열을 변경할때마다 새로운 객체를 생성하는것이 아니라 기존의 버퍼를 활용하여 효율적으로 문자열을 조작할 수 있다.
- 사용법 : StringBuilder sb = new StringBuilder();
- sb.String() : sb의 내용을 string 으로 변환

## 문장에서 가장 긴 단어 찾기 → re(알고리즘 계획해보기)
### substring()
- 문자열을 잘라내어 부분 문자열을 생성하는 메서드. 특정 범위의 문자를 추출하여 새로운 문자열을 생성한다. -> 원래 문자열은 변경되지 않는다.
### str.substring(int beginIndex);
- 지정된 인덱스로부터 끝까지의 부분 문자열을 반환한다.

### str.substring(int beginIndex, int endIndex);
- beginIndex부터 endIndex-1 까지의 부분 문자열을 반환한다.
### str.split(” “);
- 공백을 기준으로 문자열 분리 후 배열로 반환한다.

## substring활용) 암호 → (문자 2진수로 바꾸고, 10진수로 바꾸어 출력하기)
```java
String tmp = substring(0,7).replace('#', '1').replace('*','0');
int number = Integer.parseInt(tmp, 2);
answer += (char)number;
```


## 중복문자 한개만 남기기

### String.valueOf(c)
- 괄호안의 객체를 string객체로 변환

### str.indexOf(str.charAt(i)) == i
- 문자열 str에서 현재 인덱스 i 에 해당하는 문자가 처음 나타나는 위치가 현재 인덱스와 일치하는지 검사하는 조건.
- indexOf() : 인덱스의 위치를 반환.

## 문자 뒤집기
### Character.isAlphabetic(s[rt])
- 주어진 문자가 알파벳인지 판별하는 메서드, t/f 반환

## 회문 문자열 : gooG
### StringBuilder(str).reverse().toString();
- str을 가지고 stringBuilder 객체 생성, 역순으로 문자열 뒤집기, 역순으로 가진 문자열을 가지고 새로운 string 객체 생성.

### str.equalsIgnoreCase(tmp)
- str과 tmp를 비교하는 메소드로 대소문자를 무시하고 동등한지 여부를 확인하는 메서드. (Hello == hello)

## 팰린드롬 (문장형 회문 문자열)
```str = str.toUpperCase().replaceAll("[^A-Z]",""); //알파벳이 아닌것은 빈문자로 replace```
- replaceAll(String regex, String replacement) : 대체할 대상을 찾는 정규 표현식, 대체할 새로운 문자열
- [^A-Z], "" : A부터 Z까지가 아닌(^)문자열을 빈문자("")로 대체 한다.
