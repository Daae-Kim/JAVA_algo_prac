package basic;

import java.io.*;


public class 숫자만추출 {
    public String solution(String str){
        //0이 첫번째로 나오면 지우고 나머지 출력 : g0e0n2T0s8eSoft -> 208
        //숫자만 받을 수 있는 방법 : 정규 표현식
        str = str.replaceAll("[^0-9]", "");
        while(str.charAt(0) == '0')
            str = str.substring(1);
        return str;
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        숫자만추출 T = new 숫자만추출();
        System.out.println(T.solution(input));
    }
}
