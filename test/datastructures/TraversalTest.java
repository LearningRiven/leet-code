package datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datastructures.BreadthFirstSearch;
import datastructures.DepthFirstSearch;
import datastructures.Vertex;

public class TraversalTest {
	
	DepthFirstSearch<Integer> dfsTest 		= new DepthFirstSearch<Integer>();
	BreadthFirstSearch<Integer> bfsTest 	= new BreadthFirstSearch<Integer>();
	
	List<Vertex<Integer>> testList;

	Vertex<Integer> v0;
	Vertex<Integer> v1;
	Vertex<Integer> v2;
	Vertex<Integer> v3;
	Vertex<Integer> v4;
	Vertex<Integer> v5;
	Vertex<Integer> v6;
	
	@Before
	public void setup() {
		/* v------
		 * 0->5  |
		 * v  |  |
		 * 1--|  |
		 * v  v  |
		 * 3  4> 6
		 *    v 
		 *    2
		 */
		
		
		v0 = new Vertex<Integer>(0);
		v1 = new Vertex<Integer>(1);
		v2 = new Vertex<Integer>(2);
		v3 = new Vertex<Integer>(3);
		v4 = new Vertex<Integer>(4);
		v5 = new Vertex<Integer>(5);
		v6 = new Vertex<Integer>(6);
		
		v0.setNeighbors(Arrays.asList(v1,v5,v6));
		v1.setNeighbors(Arrays.asList(v3,v4,v5));
		v4.setNeighbors(Arrays.asList(v2,v6));
		v6.setNeighbors(Arrays.asList(v0));
	}
	
	@Test
	public void testDepthFirstSearchLoop() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,6,5,1,4,2,3));
		
		assertEquals(expected, dfsTest.traverse(v0));
	}
	
	@Test
	public void testDepthFirstSearchRecursive() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,1,3,4,2,6,5));
		
		assertEquals(expected, dfsTest.traverseRecursively(v0));
	}
	
	@Test
	public void testBreadthFirstSearch() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,1,5,6,3,4,2));
		
		assertEquals(expected, bfsTest.traverse(v0));
	}
	
}
