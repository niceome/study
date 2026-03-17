package junehae;

import java.io.*;

public class j_9506 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;

            //약수들의 합 구하기
            int m = 0;
            for(int i=1; i<=n-1; i++){
                if (n % i == 0){
                    m += i;
                }
            }

            //약수들의 합이 n과 같다면 출력
            if (m == n){
                System.out.print(n + " = " + 1);
                for(int i=2; i<=n-1; i++){
                    if (n % i == 0){
                        System.out.print(" + " + i);
                    }
                }
                System.out.println(" ");
            }
            else {
                System.out.println(n + " is NOT perfect.");
            }


        }
    }
}
