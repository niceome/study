package junehae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class j_11508 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] production = new Integer[n];

        for (int i=0; i<n; i++){
            production[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(production, Collections.reverseOrder());

        int count = 0;
        for (int i=1; i<=production.length; i++){
            count += production[i-1];
            if(i % 3 == 0){
                count -= production[i-1];
            }
        }

        System.out.println(count);
    }
}
