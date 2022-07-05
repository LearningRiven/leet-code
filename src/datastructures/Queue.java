package datastructures;

import java.util.ArrayList;

public class Queue<T> {
	ArrayList<T> queue;
	
	public Queue() {
		this.queue = new ArrayList<T>();
	}
	
	public void insert(T element) {
		queue.add(element);
	}
	
	public T poll() {
		if(queueNotEmpty()) {
			return queue.remove(0);
		}
		return null;
	}
	
	public T peek() {
		if(queueNotEmpty()) {
			return queue.get(0);
		}
		return null;
	}
	
	private boolean queueNotEmpty() {
		if(queue.size() == 0) {
			return false;
		}
		return true;
	}
}
