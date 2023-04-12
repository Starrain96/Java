package 배열문제;

import java.util.*;

class Solution6 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}