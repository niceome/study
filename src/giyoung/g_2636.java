package giyoung;

import java.io.*;
import java.util.StringTokenizer;

public class g_2636 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            int T = Integer.parseInt(br.readLine());

            int[] arr = new int[T];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < T; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int maxPrice = Integer.MIN_VALUE;
            long sum = 0;

            for(int i = T - 1; i >= 0; i--) {
                if(arr[i] > maxPrice) {
                    maxPrice = arr[i];
                }

                if(arr[i] < maxPrice) {
                    sum += maxPrice - arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}