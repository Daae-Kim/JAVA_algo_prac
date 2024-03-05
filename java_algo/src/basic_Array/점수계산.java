package basic_Array;

import java.util.Scanner;

public class 점수계산 {
    public int solution(int[] n, int m){
        int answer =0, cnt = 0;
        for(int i = 0; i<m; i++){
            if (n[i] == 1){
                cnt++;
                answer +=cnt;
            }
            else cnt =0;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        점수계산 T = new 점수계산();
        System.out.print(T.solution(arr, n));
    }
}
