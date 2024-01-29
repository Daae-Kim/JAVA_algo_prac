package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
//string 배열 인덱스에 접근하기
public class caseConversion {
    public String solution(String str){
        String answer ="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }else answer+=Character.toLowerCase(x);
        }
        return answer;
    } // answer 를 만들고 변환 글자를 넣어서 완성시킨다.
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        caseConversion C = new caseConversion();
        System.out.print(C.solution(input));
    }
}
