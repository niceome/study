import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        while(N-- > 0) {
            String s = br.readLine();

            Stack<Character> stack = new Stack<>();
            List<Character> list = new ArrayList<>();

            for(char ch : s.toCharArray()) {
                if(Character.isAlphabetic(ch)) {
                    list.add(ch);
                } else {
                    if(ch == '-') {

                    }
                }
            }
        }






    }
}