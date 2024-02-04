package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class flipWords {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //string builder 로 배열 원소마다 저장되어있는 단어 뒤집기
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] arg) throws IOException {
        //단어 개수 받고, 단어 각 배열에 받기, 단어 길이에 따라 인덱스 뒤집기
        flipWords T = new flipWords();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 단어개수, 3개
        String[] str = new String[num]; //개수만큼 배열 생성
        for(int i=0; i<num; i++){
            str[i] = br.readLine(); //단어 입력받기, 3개
        }
        for(String x : T.solution(num, str)){
            System.out.println(x);
        }
    }
}
