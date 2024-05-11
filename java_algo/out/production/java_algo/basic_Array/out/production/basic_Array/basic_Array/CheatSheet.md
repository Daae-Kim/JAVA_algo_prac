# CheatSheet - Array

## 큰 수 출력하기
###### 앞수보다 큰수만 출력하기

### 배열 초기화
- int[] array = new int[n];
- 배열은 고정된 배열크기와 원소들만 사용할 수 있지만 리스트는 변경 가능하다.
- 해당 문제는 새로운 배열 원소들을 한개씩 추가하므로 리스트 사용이 적절하다.
- BufferedReader 로 7 6 5 4를 입력받아 배열에 넣고자 했지만 scanner 를 사용해야했다.
- ``` BufferedReader 는 enter 를 경계로, Scanner는 enter와 space를 경계로 입력 받기때문이다.```

## 보이는 학생
###### 100 101 102 102 103 100 에서 결과값은 4
### 약했던부분들
- BufferedReader 는 Scanner와 다르게 enter 를 경계값으로 입력받는다.
- 그렇기 때문에 100 102 111처럼 space 를 경계로 입력 받을 시에는 StringTokenizer, nextToken을 사용해야한다.
- 배열인덱스 비교시 ```arr[i+1]``` 은 배열 크기보다 넘어선 인덱스에 접근하므로 에러를 일으킨다
- ```이문제에서는 i<array.length;를 사용하고, 비교할 값을 max로 지정, 큰값으로 재선언하는 방법을 사용했다.```

### 실수한 것, 다음 문제에 적용할 것
- 문제 읽고 풀이를 상상하는 과정에서 오류가 있었는데, 3번째 사람이 보이려면 2번째 사람 보다 커야하는것뿐만아니라 1번째 사람보다 커야한다.
- 그렇기에 max변수로 가장 큰 키를 저장해두고 max와 다른 키들을 비교해야하는것이 문제의 포인트이다.
- 다양한 문제를 접해보고, 간단하게 생각하려고 노력하기보다 처음부터 끝까지 생각해보는 습관을 기르자. 
- 나는 비교할 어떤 값을 저장해두고 다른값과 비교해나가는것을 생각하지 못했는데 이 문제로 변수에 수를 저장하고 비교해보는 과정을 익힌것 같다.

## re) 가위바위보
###### 가위:1 바위:2 보:3 A와 B가 가위바위보를 주어진 수만큼 수행, 이긴 사람을 출력하는문제
### 알게된 것
- 이 문제에서는 한쪽의 입장에서만 생각하고 코드를 작성하는것이 효율적이다.
- (한쪽이 이기면 다른쪽은 지는것이 당연하고, 지면 이기는것이 보장되기 때문)
- 답을 출력하는 부분에서 string 글자를 한줄에 한개씩 출력하는것에서 시간이 소요됐다.
- [ ] 3/8 복습해보기

## 피보나치수열
### 알게된 것
- 내가 처음에 생각한 풀이 방법은 배열의 인덱스를 이용해서 계산하는 것인데
- 막상 코드를 적으니 내 코드에서 인덱스를 변수로 바꾸면 변수를 재사용하는 방식으로 배열을 사용하지 않고도 가능하겠다는 생각이 든다.
- (내 코드에서는 배열의 사용이 단순히 값 저장목적이기 때문에), 피보나치2로 작성해보았는데, 변수사용로 구현하니 훨씬 간단하고 직관적인 코드가 되었다.

## re) 에라토스테네스체
###### 입력받은 수에 대해 그 이하의 소수의 개수를 출력하는 문제
### 알게된 것
- 에라토스테네스체란 주어진 수 이하의 수 중에서 소수의 개수를 알아내는 알고리즘이다.
- 2부터 수를 1씩 증가하며 2의 배수, 3의 배수, 4의 배수를 지워내며 마지막에 남는 수의 개수가 소수의 개수이다.

## re) 뒤집힌 소수
###### 23 14 15 -> 32 41 51로 바꾸고 이중 소수만 출력하는 문제
### 막힌 부분
- int 배열에서 각 원소를 뒤집는 과정.
- ArrayList를 사용해야하는 이유
- 메소드를 구성하는 과정(소수 구별, 뒤집기, 입출력 구현을 분리해서 구현하니 잘 돌아갔다.)
- [ ] 3/8
- [ ] 3/15

## 점수계산
##### 연속으로 맞으면, 2점, 3점 등 1점씩 가산점을 얻는 방식으로 최종 점수를 출력하는 문제
### 구현포인트
- 가산점을 어떻게 계산할것인지.

## 등수구하기
###### 87 89 92 100 79 -> 4 3 2 1 5
### 구현포인트
- 점수배열에서 어떻게 값을 비교할 것인지?
- 값을 비교하며 등수를 어떻게 저장할것인지?
- 출력을 어떻게 할것인지?

### 막힌부분
- 배열로 return 되는것을 출력해야하는데, 메소드 호출과 출력을 함께하는 코드를 작성하는곳에서 막혔었다.
- 이중 for 문을 생각해 내기까지 시간이 걸렸다.
```java
 for (int x : T.solution(arr, m)) System.out.print(x + " ");
```

## 격자판최대합
###### 격자판에서 대각, 행, 열의 수를 모두 더한 수 중에서 가장 큰 수를 출력한다.
- 대각선 숫자들의 합을 어떻게 구할 것인지 -> [i][i], [i][n-i-1]
- sum 값을 언제 초기화 시키고 어떻게 비교할지
- 2차원 배열 선언 및 i,j 의 방향 i는 -> j 는 |

## 봉우리
###### 격자판에서 상하좌우 중 가운데 값보다 크면 봉우리가 된다. 전체 봉우리 개수를 출력한다.
### 구현 포인트
- 좌표 설계
- 격자판에서 좌표를 어떻게 움직일것인지
- 가장자리는 0으로 초기화된다. 여기서 어떻게 outOfIndex를 피해서 구현할 것인가!!