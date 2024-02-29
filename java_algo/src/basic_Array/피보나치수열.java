package basic_Array;

import java.io.*;

public class 피보나치수열 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        arr[0]=1;
        arr[1] = 1;
        for(int i = 2; i<n; i++){
            arr[i] = (arr[i-2] + arr[i-1]);
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
