package java_algo.src.TwoPointers_SlidingWindow.retry;

import java.util.Scanner;

public class 최대매출2 {
    public int solution(int n, int k, int[] arr){
        int answer=0;
        int sum =0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String args[]){
        최대매출2 T = new 최대매출2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
