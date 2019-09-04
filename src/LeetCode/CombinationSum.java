package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    public static void main(String[] args) {
        int []cancidates = {2,3,5};
        int target = 8;
        CombinationSum.combinationSum(cancidates, target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        addList(candidates, 0,0, stack, target, result);
        return result;
    }

    private static boolean addList(int []candidates, int begin, int sum, Stack<Integer> stack, int target, List<List<Integer>> result){
        if (sum > target) return false;
        if (sum == target) {
            result.add(stack.stream().collect(Collectors.toList()));
            return true;
        }
        for (; begin < candidates.length; begin++){
            stack.push(candidates[begin]);
            addList(candidates, begin, sum + candidates[begin], stack, target, result);
            stack.pop();
        }

        return false;
    }
}
