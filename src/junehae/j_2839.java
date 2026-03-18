package junehae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int first = n;
        int count = 0;

        while (n-5 >= 0){
            n -= 5;
            count++;
        }

        while (n <= first){
            if (n == 0)
                break;
            if (n % 3 == 0){
                count += n/3;
                n=0;
                break;
            }
            n += 5;
            count--;
        }
        if (n < 10){
            if(n - 5 >= 0){
                if (n % 3 == 0){
                    count += n/3;
                    n = 0;
                }
                else {
                    n -= 5;
                    count++;
                }
            }
            if (n % 3 == 0){
                count += n/3;
                n = 0;
            }
        }
        if (first == 4 || first == 7)
            count = -1;

        System.out.println(count);
    }
}
