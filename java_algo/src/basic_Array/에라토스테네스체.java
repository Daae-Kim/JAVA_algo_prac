package basic_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 에라토스테네스체 {
    public int solution(int n
    ){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i =2; i<=n; i++){
            if(arr[i]==0){
                answer++;
                for(int j =i; j<=n; j=j+i){
                    arr[j]=1;
                }
            }
        }
        return answer;
    }
    public static void main(String arg[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        에라토스테네스체 T = new 에라토스테네스체();
        System.out.println(T.solution(n));
    }
}
