package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	private final T data;
	private boolean visited;
	private List<Vertex<T>> neighbors = new ArrayList<>();
	
	public Vertex(T data) {
		this.visited = false;
		this.data = data;
	}
	
	public Vertex(T data, List<Vertex<T>> neighbors){
		this.data = data;
		this.visited = false;
		this.neighbors = neighbors;
	}
	
	
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex<T>> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(List<Vertex<T>> neighbors) {
		this.neighbors = neighbors;
	}
	public T getData() {
		return data;
	}
	
	
}
