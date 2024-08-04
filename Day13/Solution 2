import java.util.Stack;  

public class Solution {  
    public int calculate(String s) {  
        Stack<Integer> stack = new Stack<>();  
        char sign = '+';  
        int num = 0;  

        // Iterate through the string  
        for (int i = 0; i < s.length(); i++) {  
            char c = s.charAt(i);  

            // If the current character is a digit  
            if (Character.isDigit(c)) {  
                num = num * 10 + (c - '0'); // Convert char to int  
            }  

            // If the current character is an operator or we are at the end of the string  
            if (i == s.length() - 1 || c == '+' || c == '-' || c == '*' || c == '/') {  
                switch (sign) {  
                    case '+':  
                        stack.push(num);  
                        break;  
                    case '-':  
                        stack.push(-num);  
                        break;  
                    case '*':  
                        stack.push(stack.pop() * num);  
                        break;  
                    case '/':  
                        // Handle division, considering integer division rules  
                        stack.push(stack.pop() / num);  
                        break;  
                }  

                // Update the sign and reset num  
                sign = c;  
                num = 0;  
            }  
        }  

        // Calculate the final result  
        int result = 0;  
        while (!stack.isEmpty()) {  
            result += stack.pop();  
        }  
        
        return result;  
    }  