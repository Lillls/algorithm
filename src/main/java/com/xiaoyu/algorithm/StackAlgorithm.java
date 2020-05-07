package com.xiaoyu.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class StackAlgorithm {

    public static void main(String[] args) {
        int[] ints = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        int[] ints2 = dailyTemperatures2(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        for (int anInt : ints2) {
            System.out.println(anInt);
        }
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

    /**
     * 每日温度
     * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     * <p>
     * 链接：https://leetcode-cn.com/problems/daily-temperatures
     * <p>
     * 解题思路:
     * 1.当索引为0:73,堆栈为空，把索引压入堆栈
     * 2.当索引为1:74度大于73度,把73的下标度出栈,74的索引-73的索引,就是天数.
     * 3.当索引为1入栈
     * 4.同理索引2一样
     * 5.当索引为3时:71小于75,只需要将索引3入栈
     * 6.同理索引4一样
     * 7.当索引为5时,72>69,将69出栈, 栈顶的71还是小于72,将71也出栈,直到栈顶大于72,或者栈为空,将72入栈
     * ....
     */
    //巧妙的方法
    private static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] counts = new int[temperatures.length];
        for (int i = 0; i < counts.length; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                Integer pop = stack.pop();
                counts[pop] = i - pop;
            }
            stack.push(i);
        }
        return counts;
    }
    //笨方法
    private static int[] dailyTemperatures2(int[] temperatures) {
        int[] counts = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    counts[i] = j - i;
                    break;
                }
            }
        }
        return counts;
    }
}
