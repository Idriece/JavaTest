import java.util.PriorityQueue;
import java.util.Stack;

import org.omg.CosNaming._BindingIteratorImplBase;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(1);
		System.out.print(queue.peek());
		queue.add(2);
		System.out.print(queue.peek());
		queue.add(3);
		System.out.print(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		System.out.print(stack.peek());
		stack.push(2);
		System.out.print(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		System.out.print(2 - (0) / 2);
		System.out.print(2 + 1 / 2);

	}

}
