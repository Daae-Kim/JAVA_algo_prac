package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 연속부분수열 {
    public int solution(int n, int m, int arr[]){
        //12131112
        // sum < 6 -> rt , sum >= 6 -> lt
        int lt =0;
        int answer =0; int sum = 0;
        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum == m ) answer++;
            while(sum >= m){
                sum -= arr[lt];
                lt++;
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        연속부분수열 T = new 연속부분수열();
        System.out.print(T.solution(n, m, arr));
    }
}
