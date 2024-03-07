package basic_Array;

import java.util.Scanner;

public class 등수구하기 {
    public int[] solution(int[] arr, int n){
        int[] answer = new int[n];
        for(int i =0 ; i<n; i++){
            int cnt =1;
            for(int j =0; j<n; j++){
                if(arr[i]<arr[j]){
                    cnt++;
                }
            }answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        등수구하기 T = new 등수구하기();
        for(int x : T.solution(arr, m)) System.out.print(x + " ");
    }
}
