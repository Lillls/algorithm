package com.xiaoyu.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class StackAlgorithm {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}{{{{}{}{}{234}}}}"));
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * <p>
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     */

    public static boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                stack.push(aChar);
            } else if (aChar == ')' || aChar == '}' || aChar == ']') {
                if (stack.empty()) return false;
                Character pop = stack.pop();
                Character character = hashMap.get(pop);
                if (character != aChar) return false;
            }
        }

        return stack.empty();
    }


    /**
     * 大话数据结构P108页 中缀表达式变后缀表达式
     */
}
