package basic_Array;

import java.util.Scanner;

public class 점수계산 {
    public int solution(int[] n, int m){
        int answer =0;
        for(int i = 0; i<m; i++){
            if (n[i] == 1){
                answer++;
            }
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
        T.solution(arr, n);
    }
}
