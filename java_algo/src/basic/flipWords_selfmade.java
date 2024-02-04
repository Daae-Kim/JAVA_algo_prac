package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class flipWords_selfmade {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //여기서 문자열 뒤집기, lt와 rt를 이용해서 인덱스 바꿔치기(0->4,1->3)
        //문자를 한개씩 움직이려면 char로 처리해야함.
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt]=tmp;
                lt++; rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i =0; i<n; i++){
            str[i] = br.readLine();
        }
        flipWords_selfmade T = new flipWords_selfmade();
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
