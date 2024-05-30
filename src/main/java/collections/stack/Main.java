package collections.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Stack<Integer> nums = new Stack<Integer>();
//        nums.push(10);
//        nums.push(20);
//        nums.push(30);
//
//        System.out.println(nums);
//        System.out.println(nums.search(10));
//        System.out.println(nums.search(30));
//        System.out.println(nums.search(0));
//        System.out.println(nums.pop());

        Stack<Integer> nums2 = new Stack<>();
        nums2.push(10);
        nums2.push(20);

        int x = nums2.search(10);
        System.out.println(x);
        System.out.println(nums2.get(0)); //get method uses indexes, whereas search method counts backwards(last inserted element is considered as 1
        System.out.println(nums2.get(1));






    }
}
