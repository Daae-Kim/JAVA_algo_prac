package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class findString {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==t){
            answer+=1;
            }
        }
        return answer;
    }
    public static void main(String[] arg) throws IOException {
        findString F = new findString();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char input2 = br.readLine().charAt(0); // 기록할것
        System.out.println(F.solution(input, input2));
        }
    }
