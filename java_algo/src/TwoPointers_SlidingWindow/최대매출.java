package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 최대매출 {
    public int solution(int n, int[ ] a){
        int max =0;
        //i 를 1씩 증가시키면서 i~i+2까지 합을 구하고, 다음수와 비교
        for(int i=0; i<a.length; i++){
            int sum =0;
            if(i+n <= a.length){
                for(int pointer =i; pointer < (i+n); pointer++){
                    sum += a[pointer];
                }
            }
            if(sum>max) max = sum;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[size];
        for(int i =0; i<size; i++){
            a[i] = sc.nextInt();
        }
        최대매출 T = new 최대매출();
        System.out.print(T.solution(n, a));
    }
}
