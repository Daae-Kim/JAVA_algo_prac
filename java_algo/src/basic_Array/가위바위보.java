package basic_Array;

import java.io.*;
import java.util.StringTokenizer;

public class 가위바위보 {
    public String solution(int[] a, int[] b){
        String answer ="";
        for(int i = 0; i < a.length; i++){
            if(a[i] == b[i] ){
                answer += "D";
            }else if(a[i]==1 && b[i] ==3){
                answer += "A";
            }else if(a[i] == 2 && b[i] == 1){
                answer += "A";
            }else if(a[i] == 3 && b[i] == 2){
                answer += "A";
            }else{
                answer += "B";
            }
        }
        //가위:1 바위:2 보:3 -> 1은 3을 이기고 2는 1을이기고
        return answer;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<num; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<num; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        가위바위보 T = new 가위바위보();
        for(char x : T.solution(arr1, arr2).toCharArray()){
            System.out.println(x);
        }
    }
}
