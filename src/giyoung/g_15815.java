package giyoung;

import java.io.*;
import java.util.*;

public class g_15815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                if (ch == '+') {
                    stack.push(a + b);
                } else if (ch == '-') {
                    stack.push(a - b);
                } else if (ch == '*') {
                    stack.push(a * b);
                } else if (ch == '/') {
                    stack.push(a / b);
                }
            }
        }

        System.out.println(stack.pop());
    }
}
