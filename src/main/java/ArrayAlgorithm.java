/**
 * 数组作为数据结构的优点
 * 1.构建非常简单
 * 2.根据数组索引查询元素时,时间复杂度O(1)
 * 缺点:
 * 构件时需要分配一段连续的储存空间
 * 查找元素是否存在的时间复杂度是O(n)
 * 删除和添加的时间复杂度也是O(n)
 */
public class ArrayAlgorithm {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        reversalArray(arr);
//        for (int value : arr) {
//            System.out.println(value + "");
//        }

        System.out.println(anagram("anagram", "nagaram"));
        System.out.println(anagram("hello", "hi"));
    }


    //翻转数组
    private static void reversalArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /**
     * LeetCode 第 242 题：给定两个字符串 s 和 t，编写一个函数来判断 t 是否是 s 的字母异位词。
     * <p>
     * 说明：你可以假设字符串只包含小写字母。
     * <p>
     * 字母异位词
     * 字母异位词的意思时:
     * 两端字符串中字符出现的次数一致,只有位置不一致
     * 例如: "anagram" 和 "anagram" 就是字母异位词.
     */
    private static boolean anagram(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        int[] arr = new int[26];
        for (char c : s1Array) {
            arr[c - 'a']++;
        }
        for (char c : s2Array) {
            arr[c - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
