/*Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop(). */

package Webinar4;

public class task005 {
    public static void main(String[] args) {

        MyStack1 stack = new MyStack1();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(6);
        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
