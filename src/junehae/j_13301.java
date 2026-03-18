package junehae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_13301 {
    public static long fib(int n) {
        if (n <= 1) {
            return 1L;
        }
        else{
            long next = 0L;
            long a = 0L;
            long b = 1L;
            for (int i=2; i<=n+1; i++){
                next = a + b;
                a = b;
                b = next;
            }
            return next;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long result = (fib(n) + fib(n-1)) * 2;
        System.out.println(result);
        }
    }