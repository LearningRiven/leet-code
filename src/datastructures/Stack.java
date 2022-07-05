package datastructures;

import java.util.ArrayList;

public class Stack<T>{
	
	ArrayList<T> stack;
	
	public Stack() {
		this.stack = new ArrayList<T>();
	}
	
	public void insert(T element) {
		stack.add(element);
	}
	
	public T pop() {
		if(stackNotEmpty()) {
			return stack.remove(stack.size()-1);
		}
		return null;
	}
	
	public T peek() {
		if(stackNotEmpty()) {
			return stack.get(stack.size()-1);
		}
		return null;
	}
	
	private boolean stackNotEmpty() {
		if(stack.size() == 0) {
			return false;
		}
		return true;
	}
}
