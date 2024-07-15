package programmers;

import java.util.Stack;

public class RotateParentheses {
    public static void main(String[] args) {
        String s = "[](){}";
        int answer = 0;
        String temp = "";
        Stack<String> stack = new Stack<>();

        for (int x = 0; x < s.length(); x++) {
            for (int i = 0; i < s.length(); i++) {
                temp = String.valueOf(s.charAt(i));
                if (temp.equals("{") || temp.equals("[") || temp.equals("(")) {
                    stack.push(temp);
                } else if (!stack.isEmpty()) {
                    switch (temp) {
                        case "}":
                            if (stack.peek().equals("{")) {
                                stack.pop();
                            }
                            break;
                        case "]":
                            if (stack.peek().equals("[")) {
                                stack.pop();
                            }
                            break;
                        case ")":
                            if (stack.peek().equals("(")) {
                                stack.pop();
                            }
                            break;
                    }
                } else{
                    stack.push(temp);
                }
            }

            if (stack.isEmpty()) {
                answer++;
            } else {
                stack.clear();
            }
            System.out.println(x + " " + s);
            s = rotate(s);
        }

        System.out.println(answer);
    }

    private static String rotate(String s) {
        String first = s.substring(0, 1);
        return s.substring(1) + first;
    }


}

