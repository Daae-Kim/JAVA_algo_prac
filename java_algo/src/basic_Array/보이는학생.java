package basic_Array;

import java.io.*;
import java.util.StringTokenizer;

public class 보이는학생 {
    public static int solution(int n, int[] array){
        int max = array[0];
        int count =1;
        for (int i =1; i<array.length; i++) {
            if(max < array[i]){
                count +=1;
                max = array[i];
            }
        }
        return count;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer((br.readLine()));
        for(int i = 0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, array));
    }
}
