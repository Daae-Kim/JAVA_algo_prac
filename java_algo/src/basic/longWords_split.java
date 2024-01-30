package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class longWords_split {
    public String solution(String str){
        String answer =" ";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x: s){
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] arg) throws IOException {
        longWords_split T = new longWords_split();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        T.solution(input);
    }
}
