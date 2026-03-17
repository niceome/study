package junehae;

import java.io.*;
import java.util.StringTokenizer;

public class j_2003 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int count = 0;
        for (int i=0; i<n; i++){
            sum = a[i];
            count = 0;
            for (int j=i; j<n; j++){
                sum = sum + a[j];
                if(sum == m)
                    count++;
            }
        }
    }
}
