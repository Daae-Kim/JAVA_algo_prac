package basic_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String args[])throws IOException {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int[] array = new int[input+1];
        for(int i =0; i<input; i++){
            array[i] = kb.nextInt();
        }
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(array[0]);
        for (int i = 0; i<input; i++) {
            if(array[i]<array[i+1]){
                newList.add(array[i+1]);
            }
        }
        System.out.println(newList);
    }
}
