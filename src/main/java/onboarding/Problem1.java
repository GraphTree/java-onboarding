package onboarding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;


        return answer;
    }


    public static int adder(int value) {
        if (value / 10 == 0) {
            return value;
        } else {
            return adder(value / 10) + value % 10;
        }
    }



}