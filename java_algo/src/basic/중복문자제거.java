package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복문자제거 {
    public String removeDulicates(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }return sb.toString();
    }
    public static void main(String arg[]) throws IOException {
        //문자를 입력 받을때, 그 문자가 배열에 없으면 배열에 입력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sentence_length = input.length();
        중복문자제거 T = new 중복문자제거();
        System.out.print(T.removeDulicates(input));



    }
}
