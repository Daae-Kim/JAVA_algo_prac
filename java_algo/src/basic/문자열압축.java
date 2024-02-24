package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열압축 {
    public String solution(String str){
        String answer = "";
        str = str+" ";
        int count = 1;
        for(int i =0 ; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                answer+=str.charAt(i);
                if(count > 1) answer+=String.valueOf(count);
                count = 1;
            }
        }
        return answer;
    }
    public static void main(String arg[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        문자열압축 T = new 문자열압축();
        System.out.println(T.solution(input));

    }
}
