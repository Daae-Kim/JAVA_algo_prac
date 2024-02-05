package basic;
import java.io.*;

public class 특정문자뒤집기 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        //lt,rt 이용하기, 두개모두 문자일때 swap, 특수 문자인 경우 증가, 감소
        int lt =0, rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        특정문자뒤집기 T = new 특정문자뒤집기();
        System.out.println(T.solution(str));
    }
}
