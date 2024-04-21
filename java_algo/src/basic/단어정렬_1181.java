package basic;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class 단어정렬_1181 {
    public static void main(String arg[]) throws IOException{
        //단어 개수 n, n개의 단어 한줄씩 n줄
        //짧은 순서로 출력, 같은 길이는 사전순으로 출력
        //중복은 제거하고 한개만 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i<N; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for(int i = 1; i<N; i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
