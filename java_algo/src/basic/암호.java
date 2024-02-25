package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 암호 {
    public String solution(String str, int num){
        String answer = "";
        for(int i = 0; i<num; i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int number = Integer.parseInt(tmp, 2);
            answer += (char)number;
            str = str.substring(7); // 생각보다 간단함
        }
        return answer;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String input = br.readLine();
        암호 T = new 암호();
        System.out.println(T.solution(input, number));
    }
}
