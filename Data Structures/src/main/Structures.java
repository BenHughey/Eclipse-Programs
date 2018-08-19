package main;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.PriorityQueue;
import java.util.Queue;


public class Structures {
	public static void main(String[] args) {
		//declares a new stack of strings called stack1
		Stack<String> stack1 = new Stack<String>();
		//Pushes each item to top of stack
		stack1.push("One");
		stack1.push("Two");
		stack1.push("Three");
		stack1.push("Four");
		stack1.push("Five");
		
		//string for concatenating stack items
		String stackElements = new String();

		//pops each item off stack1 and adds them to the allElements string
		for(int i = 0; i < 5; i++) {
			stackElements += stack1.pop() + " ";
			
		}
		//prints concatenated string (Stacks are last in first out)
		System.out.println("Stack contents: " + stackElements);
		
		
		//Declares new queue of strings called queue1
		Queue<String> queue1 = new ArrayBlockingQueue<String>(5);
		//adds 5 numbers
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		queue1.add("Four");
		queue1.add("Five");
		
		//String for concatenating queue items
		String queueElements = new String();
		//Uses iterator object to loop through queue1 and add each item to queueElements string
		//for each loop would be easier but wanted to try the iterator utility
		Iterator<String> iterator = queue1.iterator();
		while(iterator.hasNext()) {
			String element = (String) iterator.next();
			queueElements += element + " ";
			
		}
		//Prints concatenated string (Queues are first in first out)
		System.out.println("Queue contents: " + queueElements);
		
		
		
		
	}
	
		

}
