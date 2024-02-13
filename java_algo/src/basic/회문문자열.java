package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }
    public static void main(String args[]) throws IOException {
        회문문자열 T = new 회문문자열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
