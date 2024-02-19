package basic;

import java.io.*;

public class 유효한팰린드롬 {
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");//알파벳이 아닌것은 빈문자로 replace
        //FOUNDTIMESTUDYYDUTSEMITDNUOF -> /2 또는 reverse로 풀면 되겠다!
        /*int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                answer = "NO";
            }
        }
        return answer;*/
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String arg[])throws IOException {
        /* 문자열이 팰린드롬이면 yes, no
        -> 배열로 받아야 하나 -> 띄어쓰기로 구별해서 한 단어
        알파벳만 유효한 문자열 -> isAlphabetic
        대소문자 구분 하지 않음. -> equalsIgnoreCase
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        유효한팰린드롬 T = new 유효한팰린드롬();
        System.out.println(T.solution(input));
    }
}
