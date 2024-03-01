package basic_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치2 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 1,b =1;
        int c =0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i =0; i<num-2; i++){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
