### cheatSheet

### 대소문자 변환하기

Character.isLowerCase()

Character.ToUpperCase()

str.toCharArray()

**아스키**

대문자 : 65-90

소문자 : 97-122

### 문자열 찾기

str.charAt(i) == t

### 단어 뒤집기 → re

ArrayList<String> answer = new ArrayList<>();

StringBuilder(x).reverse().toString();

### 문장에서 가장 긴 단어 찾기 → re(알고리즘 계획해보기)

str.substring(0, pos)

str.split(” “);

### 중복문자 한개만 남기기

String.valueOf(c)

str.indexOf(str.charAt(i)) == i

### 문자 뒤집기

Character.isAlphabetic(s[rt])

### 회문 문자열 : gooG

StringBuilder(str).reverse().toString();

str.equalsIgnoreCase(tmp)