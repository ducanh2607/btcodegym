package stackqueue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStackTest {
    public static void main(String[] args) {
        ReverseStack<Integer> stack = new ReverseStack<>();
        stack.reverseInt();
        ReverseStack<String> stack1 = new ReverseStack<>();
        stack1.reverseStr();

    }


}