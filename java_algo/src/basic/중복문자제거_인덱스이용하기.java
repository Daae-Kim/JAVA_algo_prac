package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 중복문자제거_인덱스이용하기 {
    public String solution(String str){
        String answer = "";
        //인덱스가 같은것만 answer에 저장하고 나머지는 저장 하지 않는다.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer +=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        중복문자제거_인덱스이용하기 T = new 중복문자제거_인덱스이용하기();
        System.out.println(T.solution(input));
    }
}
