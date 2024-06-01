package TwoPointers_SlidingWindow.retry;

import java.util.Scanner;

public class 연속부분수열2 {
    public int solution(int n, int m, int arr[]){
        int answer =0;
        int sum =0;
        int lt=0;
        for(int rt =lt; rt < m; rt++){
                sum += arr[rt];
                if(sum == m){
                    answer++;
                }while(sum >= m){
                    sum -= arr[lt];
                    lt++;
                    if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        연속부분수열2 T = new 연속부분수열2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
