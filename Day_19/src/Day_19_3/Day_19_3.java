package Day_19_3;

import java.util.Stack;

public class Day_19_3 {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();
        stack.push("货品已出库");
        stack.push("上门收取快递");
        stack.push("送到快递分包中心");
        stack.push("货物运输途中");
        stack.push("货物已由快递员送货到小区分配中心");
        stack.push("货物已被取走");
        business(stack);
        Inquire(stack);
    }
    public static void business(Stack<String> stack) {
        stack.pop();
    }
    public static void Inquire(Stack<String> stack) {
        System.out.println(stack.peek());
    }
}
