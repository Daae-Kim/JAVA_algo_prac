package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class flipWords {
    public ArrayList<String> solution(int n, String str){
        ArrayList<String> answer = new ArrayList<>();
        return answer;
    }
    public static void main() throws IOException {
        //단어 개수 받고, 단어 각 배열에 받기, 단어 길이에 따라 인덱스 뒤집기
        flipWords T = new flipWords();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = br.readLine();
        }
        for(String x : T.solution(num, str)){
            System.out.println(x);

        }
    }
}
