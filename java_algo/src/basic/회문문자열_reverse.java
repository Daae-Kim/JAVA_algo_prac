package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열_reverse {
    public String solution(String str){
        String answer = "NO";
        //str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        회문문자열_reverse T = new 회문문자열_reverse();
        System.out.println(T.solution(input));
    }
}