package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class longWords_indexOf {
    public String solution(String str){
        String answer =" ";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1){
            //indexOf는 지정 문자를 발견한 인덱스를 반환해준다.
            // 발견했다면 2, 3 등을 반환하고, 발견하지 못하면 -1 반환
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len>m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }if(str.length() > m ){
            answer = str;
        }
        return answer;
    }
    public static void main(String[] arg) throws IOException {
        longWords_indexOf T = new longWords_indexOf();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        T.solution(input);
    }
}
