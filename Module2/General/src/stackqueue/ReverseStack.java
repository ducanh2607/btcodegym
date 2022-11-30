package stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack<T> {
    public Stack<Integer> stack =  new Stack<>();
    public Stack<Character> wStack = new Stack<Character>();
    public  void reverseInt(){
        int[] arrNum = {1,2,3,4,5};
        for (int i = 0; i < arrNum.length; i++) {
            stack.add(arrNum[i]);
        }
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrNum));
    }
    public void reverseStr(){
        String mWord = "school";

        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.println(wStack);
        mWord = "";

        final int  SIZE = wStack.size();
//        size của stack sẽ thay đổi khi pop hoặc push
        for (int i = 0; i < SIZE; i++) {
            mWord += wStack.pop();
        }
        System.out.println(mWord);
    }




}
