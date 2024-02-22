package basic;

import java.util.Scanner;

public class 문자거리 {
    public int[] solution(String s, char t){
        int[] answer= new int[s.length()];
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        문자거리 T = new 문자거리();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
