package datastructures;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch<T> {
	
	public List<T> traverse(Vertex<T> startVertex) {
		Deque<Vertex<T>> stack = new LinkedList<>();
		List<T> data = new ArrayList<T>();
		
		stack.push(startVertex);
		
		while(!stack.isEmpty()) {
			Vertex<T> current = stack.pop();
			if(!current.isVisited()) {
				current.setVisited(true);
				data.add(current.getData());
				
				List<Vertex<T>> neighbors = current.getNeighbors();
				for(Vertex<T> neighbor : neighbors) {
					stack.push(neighbor);
				}
			}
		}
		
		return data;
	}
	
	public List<T> traverseRecursively(Vertex<T> startVertex){
		List<T> data = new ArrayList<T>();
		recursor(startVertex,data);
		return data;
	}
	
	private void recursor(Vertex<T> vertex, List<T> dt) {
		vertex.setVisited(true);
		dt.add(vertex.getData());
		List<Vertex<T>> neighbors = vertex.getNeighbors();
		
		for(Vertex<T> neighbor : neighbors) {
			if(!neighbor.isVisited()) {
				recursor(neighbor, dt);
			}
		}
	}
}
