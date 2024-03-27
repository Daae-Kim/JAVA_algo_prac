package basic_Array.re;

import java.util.Scanner;

public class 임시반장정하기_2 {

    public int solution(int n, int[][] arr){
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt =0;
            for(int j=1; j<=n; j++){
                for(int k =1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String args[]){
        임시반장정하기_2 T = new 임시반장정하기_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i =1; i<n; i++){
            //i는 학생 번호
            for(int j =1; j<=5; j++){
                //j는 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
