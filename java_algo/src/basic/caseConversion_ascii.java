package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
//string 배열 인덱스에 접근하기
public class caseConversion_ascii {
    public String solution(String str){
        String answer ="";
        for(char x : str.toCharArray()){
            if(x >=97 && x<= 122)answer += (x-32);
            else answer += (x+32);
        }
        return answer;
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        caseConversion C = new caseConversion();
        System.out.print(C.solution(input));
    }
}
