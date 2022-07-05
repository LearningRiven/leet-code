package searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import datastructures.Vertex;

public class BreadthFirstSearch<T> {
	
	public List<T> traverse(Vertex<T> startVertex) {
		List<T> data = new ArrayList<T>();
		
		
		Queue<Vertex<T>> queue = new LinkedList<>();
		queue.add(startVertex);
		while(!queue.isEmpty()) {
			Vertex<T> current = queue.poll();
			if(!current.isVisited()) {
				current.setVisited(true);
				data.add(current.getData());
				for(Vertex<T> neighbor : current.getNeighbors()) {
					queue.add(neighbor);
				}
			}
			
		}
		
		return data;
	}
	
}

