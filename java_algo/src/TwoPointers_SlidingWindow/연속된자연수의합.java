package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 연속된자연수의합 {
    public int solution(int n){
        int answer =0;
        int sum =0;
        int m = n/2+1;
        int left = 0;
        int[] arr = new int[n];
        for(int i=0; i<m; i++){
            arr[i] = i+1;
        }
        for(int rt=0; rt<m; rt++){
            sum += arr[rt];
            if(sum == n) answer++;
            while(sum >=n){
                sum -= arr[left++];
                if(sum == n) answer++;
            }
        }
        //작으면 rt 증가,
        //같거나 크면 lt 증가
        return answer;
    }
    public static void main(String args[]){
        연속된자연수의합 T = new 연속된자연수의합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}