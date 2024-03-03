package basic_Array;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class 뒤집은소수 {
    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i =2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int[] arr, int n){
        ArrayList<Integer> answer = new ArrayList<>();
        //Arraylist 사용이유
        int[] arr2 = new int[n];
        for(int i =0; i<n; i++){
            //숫자 어떻게 뒤집지?
            arr2[i]= reverseNum(arr[i]);
            if(isPrime(arr2[i])) answer.add(arr2[i]);
        }
        return answer;
    }
    public static int reverseNum(int x){
        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
        return Integer.parseInt(sb.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        뒤집은소수 T = new 뒤집은소수();
        for(int x : T.solution(arr, n)) System.out.print(x + " ");

    }
}
