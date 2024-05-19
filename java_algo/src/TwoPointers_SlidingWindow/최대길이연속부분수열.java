package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public int solution(int n, int k, int[] arr){
        int answer = 0; // rt=lt+1 (길이)
        int cnt = 0; int lt =0;
        for(int rt =0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        //0을 만나면 1을 넣고, 길이를 샌다.
        //k+1 번째 0을 만나면 lt를 증가하고,
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        최대길이연속부분수열 T = new 최대길이연속부분수열();
        T.solution(n, k, arr);
    }
}
